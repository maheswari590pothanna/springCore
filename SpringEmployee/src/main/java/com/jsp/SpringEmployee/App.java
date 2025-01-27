package com.jsp.SpringEmployee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ap=new AnnotationConfigApplicationContext(AppConfig.class);
        Employee e=ap.getBean(Employee.class);
        System.out.println(e);
        Employee e1=ap.getBean(Employee.class);
        System.out.println(e1);
        Employee e2=ap.getBean(Employee.class);
        System.out.println(e2);
    }
}
