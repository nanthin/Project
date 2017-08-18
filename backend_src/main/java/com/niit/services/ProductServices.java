package com.niit.services;


import java.util.List;

import com.niit.model.Category;
import com.niit.model.addproduct;




public interface ProductServices {
	void saveproduct(addproduct product);
	
List<addproduct> getAllAddproducts();

	addproduct getaddproductById(int id);
	
	void deleteProduct(int id);
	
	void updateProduct(addproduct product);
	List<Category>getAllCategories();


}
