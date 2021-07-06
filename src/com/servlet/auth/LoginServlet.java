package com.servlet.auth;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDAO;
import com.entity.User;
import com.servlet.base.BaseServlet;


@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UserDAO userDAO;
    private String error="";
    public LoginServlet() {
        super();
        this.userDAO = new UserDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/views/auth/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email"),
				password = request.getParameter("password");

			User entity = this.userDAO.login(email, password);
			
			if (entity != null) {
				HttpSession servletSession = request.getSession();
				servletSession.setAttribute("user", entity);
				if(entity.getRole() == 1) {
				response.sendRedirect(
						request.getContextPath() + "/admin/user"
					);
				}else {
					response.sendRedirect(
							request.getContextPath() + "/showVideo"
						);
				}
			}else {
				response.sendRedirect(
						request.getContextPath() + "/Login"
					);
			}
			
	}

}
