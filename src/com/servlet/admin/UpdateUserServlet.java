package com.servlet.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.dao.UserDAO;
import com.entity.User;


@WebServlet("/admin/users/update")
public class UpdateUserServlet extends HttpServlet {
	private UserDAO userDAO;
	private static final long serialVersionUID = 1L;
       
    public UpdateUserServlet() {
        super();
        // TODO Auto-generated constructor stub
        this.userDAO = new UserDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt( request.getParameter("id") );
		System.out.println("mã id: " + id);
		User entity = this.userDAO.findById(id);
		request.setAttribute("user", entity);
		request.getRequestDispatcher("/views/admin/user/edit.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User entity = new User();
		try {
			BeanUtils.populate(entity, request.getParameterMap());
		} catch (Exception e) {
			e.printStackTrace();
		}

		this.userDAO.update(entity);
		
		System.out.println("------" + request.getContextPath());
		response.sendRedirect(request.getContextPath() + "/admin/user");
	}

}
