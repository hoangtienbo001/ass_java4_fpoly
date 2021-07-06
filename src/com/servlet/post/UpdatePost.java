package com.servlet.post;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.dao.PostDAO;
import com.entity.Post;
import com.servlet.base.BaseServlet;

@WebServlet("/admin/post/update")
public class UpdatePost extends BaseServlet {
	private static final long serialVersionUID = 1L;
	private PostDAO postDAO;

    public UpdatePost() {
        super();
        this.postDAO = new PostDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt( request.getParameter("id_post") );
		
		Post entity = this.postDAO.findById(id);
		
		String view = "/views/admin/post/index.jsp";
		
		this.render(request, response,view);
		
		request.setAttribute("post", entity);
		
		request.getRequestDispatcher("/views/layout.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Post entity = new Post();
		try {
			BeanUtils.populate(entity, request.getParameterMap());
		} catch (Exception e) {
			e.printStackTrace();
		}

		this.postDAO.update(entity);
		
		response.sendRedirect(request.getContextPath() + "/admin/post");
	}


}