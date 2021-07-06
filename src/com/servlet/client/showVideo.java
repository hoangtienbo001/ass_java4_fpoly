package com.servlet.client;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.PostDAO;
import com.entity.Post;
import com.servlet.base.BaseServlet;

@WebServlet("/showVideo")
public class showVideo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PostDAO postDAO;
    public showVideo() {
        super();
        this.postDAO = new PostDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pageStr = request.getParameter("page"),
				limitStr = request.getParameter("limit");
		int page = pageStr == null ? 1 : Integer.parseInt( pageStr ),
			limit = limitStr == null ? 12 : Integer.parseInt( limitStr ),
			offset = limit * (page - 1);
		List<Post> listPost = this.postDAO.paginateuser(offset, limit);
		request.setAttribute("page", page);
		request.setAttribute("listPost", listPost);
		request.getRequestDispatcher("/views/client/dashboard.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
