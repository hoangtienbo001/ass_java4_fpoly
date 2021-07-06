/**
 * 
 */
package com.servlet.probuild;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ADMIN
 *
 */
@WebServlet("/hello-poly") // annotation
public class test extends HttpServlet {
	@Override
	protected void doGet(
			HttpServletRequest request, 
			HttpServletResponse respone
			) throws IOException, ServletException{
		String param = request.getParameter("name");
		String name = param != null ? param : "hello";
		request.setAttribute("myname", name);
		request.getRequestDispatcher("/views/Hellobro.jsp").forward(request,respone);
	}
}
