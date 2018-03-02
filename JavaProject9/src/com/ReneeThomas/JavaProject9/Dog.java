package com.ReneeThomas.JavaProject9;

public class Dog extends Animal {
String breed;
	
	public Dog(String name, String breed) {
		super(name);
		this.breed = breed;
		System.out.println("You have created a new " + breed + " named "+ name + ".");
	}
}
