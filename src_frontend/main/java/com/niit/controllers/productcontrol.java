package com.niit.controllers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
//import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.niit.model.Category;
import com.niit.model.addproduct;
import com.niit.services.ProductServices;




//import com.niit.model.Product;


@Controller

public class productcontrol {
	
	@Autowired
	private ProductServices productServices;
	
	@RequestMapping("/admin/addproduct")
	public String getaddproduct(Model model)
	{
		List<Category> categories=productServices.getAllCategories();
		model.addAttribute("categories", categories);
		model.addAttribute("product",new addproduct());
		return "addproduct";
	}
	@RequestMapping("/admin/addproduct/saveproduct")
	 public String saveProduct(@Valid @ModelAttribute(name="product") addproduct product,BindingResult result,Model model )
    {
		if(result.hasErrors())
    	{
    		List<Category> categories=productServices.getAllCategories();
    		model.addAttribute("categories", categories);
    		return "addproduct";
    	}
    	productServices.saveproduct(product);
    	MultipartFile image=product.getImage();
    	Path path=Paths.get("C:\\Users\\windows\\workspace\\Laptop\\src\\main\\webapp\\WEB-INF\\resources\\images\\"+product.getId()+".png");
    	try {
			image.transferTo(new File(path.toString()));
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return "redirect:/all/addproduct/viewproduct";
    }
	 @RequestMapping("/all/addproduct/viewproduct")
     public String getAllAddproducts(Model model)
     {
		 System.out.println(1);
     	List<addproduct> products=productServices.getAllAddproducts();
     	 System.out.println(2);
     	model.addAttribute("products", products);
     	 System.out.println(3);
     	return "productlist";
     }
	 
	 @RequestMapping("/all/addproduct/viewproduct/{id}")
     public String getAddproductById(@PathVariable int id,Model model)
     {
		 System.out.println(4);
     addproduct product=productServices.getaddproductById(id);
     System.out.println(5);
     model.addAttribute("product", product);
     System.out.println(6);
     return "viewproduct";
     }
	 
	@RequestMapping("/admin/addproduct/deleteproduct/{id}")
     public String deleteProductById(@PathVariable int id)
     {
     productServices.deleteProduct(id);
     
     return "redirect:/all/addproduct/viewproduct";
     }
	
	 @RequestMapping("/admin/addproduct/geteditform/{id}")
     public String getEditForm(@PathVariable int id,Model model)
     {
		 List<Category> categories=productServices.getAllCategories();
     	model.addAttribute("categories", categories);
     addproduct product=productServices.getaddproductById(id);
     model.addAttribute("productObj", product);
     return "editform";
     }
	 
     @RequestMapping("/admin/addproduct/editproduct")
     public String editProduct(@Valid @ModelAttribute(name="productObj") addproduct product,BindingResult result,Model model)
     {
    	 if(result.hasErrors())
     	{
     		List<Category> categories=productServices.getAllCategories();
     		model.addAttribute("categories", categories);
     		return "editform";
     	}
     productServices.updateProduct(product);
     
 	MultipartFile image=product.getImage();
 	Path path=Paths.get("C:\\Users\\windows\\workspace\\Laptop\\src\\main\\webapp\\WEB-INF\\resources\\images\\"+product.getId()+".png");
 	try {
			image.transferTo(new File(path.toString()));
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	
 	return "redirect:/all/addproduct/viewproduct";
 
     
     }
     
     @RequestMapping("/all/addproduct/searchbycategory")
     public String selectByCategory(@RequestParam String searchCondition,Model model)
     {
     	model.addAttribute("products",productServices.getAllAddproducts());
     	if(searchCondition.equals("All"))
     		model.addAttribute("searchCondition","");
     	else
     		model.addAttribute("searchCondition",searchCondition);
     	return "productlist";
     }
}



	