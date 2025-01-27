package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		Student student = ac.getBean(Student.class);
		System.out.println(student);
		System.out.println(student.getAddress());
		
		
		
		
	}
}
