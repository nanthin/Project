package com.niit.dao;



import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Category;
import com.niit.model.addproduct;
@Repository
public class productdaoimplementation implements productdao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveproduct(addproduct product) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.save(product);
		
	}

	@SuppressWarnings("unchecked")
	public List<addproduct> getAllAddproducts() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from addproduct");
		List<addproduct> products=query.list();
		return products;
		
	}

	public addproduct getaddproductById(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		addproduct product=(addproduct)session.get(addproduct.class, id);
		return product;
	}

	public void deleteproduct(addproduct product) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.delete(product);
	}

	public void editproduct(addproduct product) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		//session.beginTransaction();
		session.update(product);
		//session.getTransaction().commit();
		
	}

	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Category");
		List<Category>categories=query.list();
		return categories;
	}

	

	
	}
	


	
	
		

