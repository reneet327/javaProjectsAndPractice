package com.ReneeThomas.JavaProject7;

public class Manager extends Employee{
	
	public Manager() {
		System.out.println("You created a new Manager using the default constructor.");
	}
	
	public Manager(String fName, String lName, String compTitle, int years, int ssn) {
		super( fName, lName, compTitle, years, ssn);
		System.out.println("A new manager has been created using the overloaded constructor.");
	}

}
