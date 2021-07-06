package com.servlet.admin; 

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDAO;
import com.entity.User;
import com.servlet.base.BaseServlet;
@WebServlet("/admin/user")
public class UserServlet extends BaseServlet{
	private UserDAO userDao;
	public UserServlet() {
		super();
		this.userDao = new UserDAO();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		String pageStr = req.getParameter("page"),
				limitStr = req.getParameter("limit");
		int page = pageStr == null ? 1 : Integer.parseInt( pageStr ),
			limit = limitStr == null ? 10 : Integer.parseInt( limitStr ),
			offset = limit * (page - 1);
		List<User> listUser = this.userDao.paginate(offset, limit);
		req.setAttribute("page", page);
		req.setAttribute("listUser", listUser);
		String view = "/views/admin/user/index.jsp";
		this.render(req, resp,view);
		req.getRequestDispatcher("/views/layout.jsp").forward(req, resp);
	}
}
