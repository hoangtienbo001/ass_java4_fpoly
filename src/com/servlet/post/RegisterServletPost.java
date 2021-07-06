package com.servlet.post;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;
import org.hibernate.Session;

import com.dao.PostDAO;
import com.entity.Post;
import com.entity.User;
import com.servlet.base.BaseServlet;
import com.util.HibernateUtil;

@WebServlet("/register/post")
public class RegisterServletPost extends BaseServlet {
	private static final long serialVersionUID = 1L;
       
    public RegisterServletPost() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession  session_user = request.getSession();
		User id_user = (User) session_user.getAttribute("user");
		session_user.setAttribute("ID_NDHT", id_user.getId());
		System.out.println(id_user);
		String view = "/views/admin/post/newPost.jsp";
		this.render(request, response,view);
		request.getRequestDispatcher("/views/layout.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Post entity = new Post();
		try {
			BeanUtils.populate(entity,request.getParameterMap());
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		Session session = HibernateUtil.getSession();
		
		PostDAO dao = new PostDAO();
		dao.store(entity);
		System.out.println("------" + request.getContextPath());
		response.sendRedirect(request.getContextPath() + "/admin/post");
	}
	
	@Override
	public void init() throws ServletException
	{
		System.out.println("Initializing...");
		super.init();
	}

	@Override
	public void destroy()
	{
		System.out.println("Destroying...");
		super.destroy();
	}

	@Override
	public void service(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
		System.out.println("Processing...");
		super.service(request, response);
	}

}

