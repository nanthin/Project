package com.niit.services;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.productdao;
import com.niit.model.Category;
import com.niit.model.addproduct;


@Service
@Transactional
public class ProductServicesimple implements ProductServices {
	public ProductServicesimple()
	{
		System.out.println("productserviceImplementation object is created");
		}
	@Autowired
	private productdao productDao;

	public void saveproduct(addproduct product) {
		// TODO Auto-generated method stub
		productDao.saveproduct(product);
	}

	public List<addproduct> getAllAddproducts() {
		// TODO Auto-generated method stub
		return productDao.getAllAddproducts();
		
	}

	public addproduct getaddproductById(int id) {
		// TODO Auto-generated method stub

		return productDao.getaddproductById(id);
		
	}

	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		addproduct product=getaddproductById(id);
		productDao.deleteproduct(product);
		
		
	}

	public void updateProduct(addproduct product) {
		productDao.editproduct(product);
		
		// TODO Auto-generated method stub
	}

	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return productDao.getAllCategories();
	}

	
	}

	




