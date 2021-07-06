package com.servlet.post;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.PostDAO;
import com.entity.Post;

@WebServlet("/admin/post/delete")
public class DeletePost extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PostDAO postDAO;

    public DeletePost() {
        super();
        this.postDAO = new PostDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idStr = request.getParameter("id_post");

		if (idStr == null) {
			// 400 Bad Request
		}

		int id = Integer.parseInt(idStr);

		Post entity = new Post();

		entity.setId_post(id);

		this.postDAO.delete(entity);

		response.sendRedirect("/test1/admin/post");
	}

}
