package com.ReneeThomas.JavaProject9;

public class Cat extends Animal {
 //variables
	String breed;
	
	public Cat(String name, String breed) {
		super(name);
		this.breed = breed;
		System.out.println("You have created a new " + breed + " cat named "+ name + ".");
	}
}
