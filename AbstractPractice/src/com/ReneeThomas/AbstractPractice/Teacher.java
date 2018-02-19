package com.ReneeThomas.AbstractPractice;

public class Teacher extends Person {
	//create variables for Teacher
	private String subject;

	
	public Teacher(String name, int age, String subject) {
		super(name, age);
		setSubject(subject);
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public void sayHello(){
		System.out.println("Hello, my name is " + this.getName() + " and I teach " + this.subject);
	}


}
