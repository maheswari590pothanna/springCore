package com.jsp.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
public class App 
{
    public static void main( String[] args )
    {
     BeanFactory bf=new XmlBeanFactory(new FileSystemResource("spring.xml"));
    // System.out.println(1);
     Student s=bf.getBean(Student.class);
     System.out.println(s);
     
     System.out.println(s.getEmployee());
    
    }
}
