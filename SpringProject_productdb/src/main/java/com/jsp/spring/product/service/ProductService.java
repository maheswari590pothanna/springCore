package com.jsp.spring.product.service;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.spring.product.entity.Product;
import com.jsp.spring.product.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	private Scanner scan = new Scanner(System.in);
	
	public void addProduct()
	{
		Product p=new Product();
		System.out.println("Enter productId");
		p.setProductId(scan.nextInt());
		System.out.println("enter productName");
		p.setProductName(scan.next());
		System.out.println("enter productBrand");
		p.setProductBrand(scan.next());
		System.out.println("enter productprice");
		p.setProductPrice(scan.nextInt());
		
		productRepository.addProduct(p);
		System.out.println("Inserted SuccessFully");
	}
	
	public void findById()
	{
		System.out.println("enter the productid");
		Product product=productRepository.findById(scan.nextInt());
		System.out.println(product);
	}
	
	public void updateProduct()
	{
		System.out.println("enter the productId");
		Product product=productRepository.findById(scan.nextInt());
		
		System.out.println("enter the ProductName");
		product.setProductName(scan.next());
		System.out.println("enetr the productbrand");
		product.setProductBrand(scan.next());
		System.out.println("enetr the productprice");
		product.setProductPrice(scan.nextInt());
		System.out.println("updated successfully");
		
		productRepository.updateProduct(product);
	}
	
	public void findAll()
	{
		List<Product> product=productRepository.findAll();
		for(Product p:product)
		{
			System.out.println(p);
		}
	}

}
