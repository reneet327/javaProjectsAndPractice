package com.ReneeThomas.HoningProgrammingPractice;

public class EmployeeBuilder {
//mandatory variables
	private String firstName;
	private String lastName;
	private String jobTitle;
	private float salary;
	
//optional variables
	private String streetAddress;
	private String city;
	private String state;
	private int zipCode;
	private String phoneNumber;
	
//Constructor
	public EmployeeBuilder(String firstName, String lastName, String jobTitle, float salary){}
	this.firstName = firstName;
	this.lastName = lastName;
    this.jobTitle = jobTitle;
    this.salary = salary;
	}

//setters
	public EmployeeBuilder setStreetAddress(String streetAddress){
		this.streetAddress = streetAddress;
		return this;
	}
	
	public EmployeeBuilder setCity(String city){
		this.city = city;
		return this;
	}
	
	public EmployeeBuilder setState(String state){
		this.state = state;
		return this;
	}
	
	public EmployeeBuilder setZip(int zip){
		this.zipCode = zip;
		return this;
	}
	
	public EmployeeBuilder setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
        return this;
    }
	
	 // last method in `EmployeeBuilder` class
    public Employee build(){
    	return new Employee(this);
    }


}
