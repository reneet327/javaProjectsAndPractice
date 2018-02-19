package com.ReneeThomas.AbstractPractice;

public abstract class Person {
// create variables
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// create say hello function
	
	public void sayHello() {
		System.out.println("Hello, my name is " + this.name);
	}
	
	//create getter for age
	public int getAge() {
		return this.age;
	}
	
	//create getter for name
		public String getName() {
			return this.name;
		}
	
	
}
