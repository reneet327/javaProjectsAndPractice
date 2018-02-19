package com.ReneeThomas.JavaProject7;

public class Employee {
	//variables
	String firstName;
	String lastName;
	String companyTitle;
	int yearsAtCompany;
	private int SSN;
	
	// default constructor
	public Employee(){
		firstName = "";
		lastName = "";
		companyTitle = "";
		yearsAtCompany = 0;
		SSN = -1;
	}
	
	//overloaded constructor
	public Employee(String fName, String lName, String compTitle, int years, int ssn){
		firstName = fName;
		lastName = lName;
		companyTitle = compTitle;
		yearsAtCompany = years;
		SSN = ssn;
	}
	
	//Setters
	public void setFirstName(String fn) {
		this.firstName = fn;
	}
	public void setLastName(String ln) {
		lastName = ln;
	}	
	public void setCompanyTitle(String ct) {
		companyTitle = ct;
	}	
	public void setYearsAtCompany(int years) {
		yearsAtCompany = years;
	}
	public void setSSN(int ssn) {
		SSN = ssn;
	}
	
	//Getters
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getCompanyTitle() {
		return companyTitle;
	}
	public int getYearsAtCompany() {
		return yearsAtCompany;
	}
	public int getSSN() {
		return SSN;
	}
	
	//override toString method to print out employee details
	
	public String toString() {
		return  firstName + " " + lastName + " has worked at " +  
				companyTitle + " for " + yearsAtCompany + " year(s) as a(n) Employee. "
				+ "His SSN is: " + SSN;
		
	}

}
