package com.jsp.spring.product;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.spring.product.controller.ProductController;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ap=new AnnotationConfigApplicationContext(AppConfig.class);
        ProductController pc=ap.getBean(ProductController.class);
        
//        pc.addProduct();
//        pc.findById();
  //        pc.updateProduct();
        pc.findAll();
    }
}
