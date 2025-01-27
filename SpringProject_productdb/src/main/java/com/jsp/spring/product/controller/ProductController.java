package com.jsp.spring.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.jsp.spring.product.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	public void addProduct()
	{
		productService.addProduct();
	}
	public void findById()
	{
		productService.findById();
	}
	public void updateProduct()
	{
		productService.updateProduct();
	}
	public void findAll()
	{
		productService.findAll();
	}
	

}
