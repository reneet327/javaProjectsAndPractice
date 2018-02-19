package com.ReneeThomas.JavaProject7;

public class Designer extends Employee{
	
	public Designer() {
		System.out.println("You created a new Designer using the default constructor.");
	}
	
	public Designer(String fName, String lName, String compTitle, int years, int ssn) {
		super( fName, lName, compTitle, years, ssn);
		System.out.println("A new Designer has been created with an overloaded constructor.");
	}
	
	

}
