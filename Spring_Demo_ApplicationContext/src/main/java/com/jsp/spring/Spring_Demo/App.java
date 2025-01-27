package com.jsp.spring.Spring_Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext ap=new ClassPathXmlApplicationContext("spring.xml");
      System.out.println(1);
      Student s=ap.getBean(Student.class);
      System.out.println(2);
    System.out.println(s);
    
    
      System.out.println(3);
      Student s1=ap.getBean(Student.class);
      System.out.println(s1);
      
      

    	
    	
    	
    	
    	
    }
}
