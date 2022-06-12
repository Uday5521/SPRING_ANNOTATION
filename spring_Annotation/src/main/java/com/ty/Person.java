package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Value initalizing using Annotation

@Component(value = "myPerson")
public class Person {
	
	
	//1.Variable initalizing
	@Value(value = "23")
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	
	//2.Setter Initalizing
	@Value("Uday")
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String gender;

	//3.Constructor Initalizing
	public Person(@Value(value="male")String gender) {
		super();
		this.gender = gender;
	}
	
	
	
}	