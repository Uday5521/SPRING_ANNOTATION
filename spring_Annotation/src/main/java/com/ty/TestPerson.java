package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPerson {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.ty");
		Person p = (Person) context.getBean("myPerson");
		System.out.println(p.getName());
		System.out.println(p.getAge());
		
		System.out.println(p.gender);
	}

}
