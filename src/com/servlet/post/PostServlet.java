package com.servlet.post;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.PostDAO;
import com.entity.Post;
import com.servlet.base.BaseServlet;

@WebServlet("/admin/post")
public class PostServlet extends BaseServlet {
	private PostDAO postDAO;
    public PostServlet() {
        super();
        this.postDAO = new PostDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pageStr = request.getParameter("page"),
				limitStr = request.getParameter("limit");
		int page = pageStr == null ? 1 : Integer.parseInt( pageStr ),
			limit = limitStr == null ? 10 : Integer.parseInt( limitStr ),
			offset = limit * (page - 1);
		List<Post> listPost = this.postDAO.paginateadmin(offset, limit);
		request.setAttribute("page", page);
		request.setAttribute("listPost", listPost);
		String view = "/views/admin/post/edit.jsp";
		this.render(request, response,view);
		request.getRequestDispatcher("/views/layout.jsp").forward(request, response);
	}

}
