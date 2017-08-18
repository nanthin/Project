package com.niit.dao;






import java.util.List;

import com.niit.model.Category;
import com.niit.model.addproduct;


public interface productdao {
	void saveproduct(addproduct product);
	
	List<addproduct> getAllAddproducts();
	addproduct getaddproductById(int id);
	void deleteproduct(addproduct product);
	void editproduct(addproduct product);
	List<Category>getAllCategories();
	}
