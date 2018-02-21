package com.ReneeThomas.HoningProgrammingPractice;

public class Employee {
	 // mandatory parameters
    private String firstName;
    private String lastName;
    private String jobTitle;
    private float salary;
    private EmployeeBuilder b = new EmployeeBuilder();
    
    
    // optional parameters
    private String streetAddress;
    private String city;
    private String state;
    private int zipCode;
    private String phoneNumber;

    private Employee(EmployeeBuilder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.jobTitle = builder.jobTitle;
        this.salary = builder.salary;
        this.streetAddress = builder.streetAddress;
        this.city = builder.city;
        this.state = builder.state;
        this.zipCode = builder.zipCode;
        this.phoneNumber = builder.phoneNumber;

    }
    
    

	// nest EmployeeBuilder class
   

    public static class EmployeeBuilder {
    //mandatory variables
    	private String firstName;
    	private String lastName;
    	private String jobTitle;
    	private float salary;
    	
    //optional variables
    	private static String streetAddress;
    	private static String city;
    	private String state;
    	private int zipCode;
    	private String phoneNumber;
    	
    //Constructor
    	EmployeeBuilder() {
    		this.firstName = "";
        	this.lastName = "";
            this.jobTitle = "";
            this.salary = 0.0f;
            this.streetAddress = "";
        	this.city = "";
        	this.state = "";
        	this.zipCode = 0;
        	this.phoneNumber = "";
    	}
    	
    	EmployeeBuilder(String firstName, String lastName, String jobTitle, float salary) {
    	this.firstName = firstName;
    	this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.salary = salary;
    	}

    //setters
    	public String setStreetAddress(String streetAddress){
    		//this.streetAddress = streetAddress;
    		return EmployeeBuilder.streetAddress = streetAddress;
    	}
    	
    	public String setCity(String city){
    		
    		return EmployeeBuilder.city = city;
    	}
    	
    	public String setState(String state){
    		
    		return this.state = state;
    	}
    	
    	public int setZip(int zip){
    		
    		return this.zipCode = zip;
    	}
    	
    	public String setPhoneNumber(String phoneNumber){
            
            return this.phoneNumber = phoneNumber;
        }
    	
    	 // last method in `EmployeeBuilder` class
        public Employee build(){
        	return new Employee(this);
        }


    }
}
