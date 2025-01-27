package com.jsp.spring_Project.SpringApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ap=new ClassPathXmlApplicationContext("spring.xml");
        System.out.println(1);
        Student s=ap.getBean(Student.class);
        System.out.println(s.id);
        System.out.println(s.id+s.name);
    }
}
