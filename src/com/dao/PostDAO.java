package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.entity.Post;
import com.util.HibernateUtil;

public class PostDAO {
	public Post store(Post entity) {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();

		Integer id = (Integer) session.save(entity);

		session.getTransaction().commit();

		entity.setId_post(id);

		return entity;
	}

	public List<Post> paginateuser(int offset, int limit) {
		String hql = "FROM Post";
		Session session = HibernateUtil.getSession();
		Query query = session.createQuery(hql);
		query.setFirstResult(offset);
		query.setMaxResults(offset + limit);

		List<Post> listPost = query.getResultList();
		for(int i =0;i<listPost.size();i++) {
			if(listPost.get(i).getState() == 0) {
				listPost.remove(i);
			}
		}
		return listPost;
	}
	
	public List<Post> paginateadmin(int offset, int limit) {
		String hql = "FROM Post";
		Session session = HibernateUtil.getSession();
		Query query = session.createQuery(hql);
		query.setFirstResult(offset);
		query.setMaxResults(offset + limit);

		List<Post> listPost = query.getResultList();

		return listPost;
	}

	public Post findById(int id) {
		Session session = HibernateUtil.getSession();
		Post entity = session.get(Post.class, id);

		return entity;
	}

	public void update(Post entity) {
		Session session = HibernateUtil.getSession();

		try {
			session.beginTransaction();

			session.clear();
			session.update(entity);

			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
	}
	
	public void delete(Post entity)
	{
		Session session = HibernateUtil.getSession();
		session.clear();

		try {
			session.beginTransaction();

			session.delete(entity);

			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			
			session.getTransaction().rollback();
		}
	}
}

