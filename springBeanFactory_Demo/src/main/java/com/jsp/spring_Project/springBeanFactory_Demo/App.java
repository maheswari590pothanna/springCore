package com.jsp.spring_Project.springBeanFactory_Demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class App 
{
    public static void main( String[] args )
    {
      BeanFactory bf=new XmlBeanFactory(new FileSystemResource("spring.xml"));
      System.out.println(1);
      Product p=bf.getBean(Product.class);
      System.out.println(p);
      System.out.println(p.payment);
      
    }
}
