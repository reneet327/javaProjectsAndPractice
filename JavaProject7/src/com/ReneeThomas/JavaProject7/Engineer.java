package com.ReneeThomas.JavaProject7;

public class Engineer extends Employee{
	
	public Engineer() {
		System.out.println("A new engineer has been created with an default constructor.");
	}
	
	public Engineer(String fName, String lName, String compTitle, int years, int ssn) {
		super( fName, lName, compTitle, years, ssn);
		System.out.println("A new engineer has been created with an overloaded constructor.");
	}

}
