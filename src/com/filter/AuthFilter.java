package com.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.entity.User;

@WebFilter({"/admin/*","/register/*","/client/*"})
public class AuthFilter implements Filter {

    public AuthFilter() {

    }

	public void destroy() {
		System.out.println("AuthDestroy is distroy");
	}
	
	protected void render(HttpServletRequest request, HttpServletResponse response,String view) {
		request.setAttribute("view", view);
		request.getRequestDispatcher("/views/layout.jsp");
	}

	public void doFilter(ServletRequest request, 
						 ServletResponse response, 
						 FilterChain chain) throws IOException, ServletException 
	{
		HttpServletRequest initRequest = (HttpServletRequest) request;
		HttpSession  session = initRequest.getSession();
		User authUser = (User) session.getAttribute("user");
		String uri = initRequest.getRequestURI();
		if(authUser == null) {
			HttpServletResponse httpResponese = (HttpServletResponse) response;
			request.getRequestDispatcher("/views/erorLogin/LoginFailed.jsp").forward(initRequest, httpResponese);
		}else if(authUser.getRole() == 1 && uri.contains("/admin/")) {
			HttpServletResponse httpResponese = (HttpServletResponse) response;
			request.getRequestDispatcher("/showVideo").forward(initRequest, httpResponese);
		}else if(authUser.getStatus() == 0) {
			HttpServletResponse httpResponese = (HttpServletResponse) response;
			request.getRequestDispatcher("/views/erorLogin/BannedAc.jsp").forward(initRequest, httpResponese);
		}
		else {
			chain.doFilter(request, response);
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("AuthFilter is init...");
	}

}

