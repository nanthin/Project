/*package com.niit.dao;

import java.util.List;
//import java.util.Locale.Category;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Category;
import com.niit.model.addproduct;

@Repository
public class CategoryDaoImpl implements CategoryDao {
 
    @Autowired
	private SessionFactory sessionFactory;
	
    public void saveCategory(Category category) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.save(category);
		
	}

	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Category");
		List<Category> categorys=query.list();
		return categorys;
		
		
	}

	public Category getCategoryById(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Category category=(Category)session.get(Category.class, id);
		return category;
	}

	public void deleteCategory(Category category) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.delete(category);
		
	}

	public void editCategory(Category category) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.update(category);
	}

	public List<addproduct> getAllproducts() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from addproduct");
		List<addproduct> products=query.list();
		return products;
	}

}
*/