/*package com.niit.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.CategoryDao;
import com.niit.model.Category;
import com.niit.model.addproduct;
@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
    private CategoryDao categoryDao;
	public void savecategory(Category category) {
		// TODO Auto-generated method stub
		categoryDao.saveCategory(category);
	}

	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return categoryDao.getAllCategories();
		
	}

	public Category getCategoryById(int id) {
		// TODO Auto-generated method stub
		return categoryDao.getCategoryById(id);
	}

	public List<addproduct> getAllproducts() {
		// TODO Auto-generated method stub
		return categoryDao.getAllproducts();
	}

	public void deletecategory(int id) {
		// TODO Auto-generated method stub
		Category category=getCategoryById(id);
		categoryDao.deleteCategory(category);
		
	}

	public void updatecategory(Category category) {
		// TODO Auto-generated method stub
		categoryDao.editCategory(category);
	}

	


		
	}

	





*/