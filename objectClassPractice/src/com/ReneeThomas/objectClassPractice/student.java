package com.ReneeThomas.objectClassPractice;

public class student {

	//class variables
	String firstName;
	String lastName;
	String courseFocus;
	private String initials;
	
	//create constructors
	public student() {
		firstName="";
		lastName="";
		courseFocus="";
		initials = "";
		System.out.println("Student object created!");
	}
	
	//overloaded constructor
	public student(String fName, String lName, String focus) {
		firstName = fName;
		lastName = lName;
		courseFocus = focus;
		setInitials();
		System.out.println(fName + " " + lName + "("+ initials + ")" +  " Has signed up for " + focus + ".");
	}
	
	//getter methods
	public String getFirstName() {
		return(firstName);
	}
	public String getLastName() {
		return(lastName);
	}
	public String getCourseFocus() {
		return(courseFocus);
	}
	public String getInitials() {		
		setInitials();
		return initials;
	}
	
	//setter methods
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setCourseFocus(String courseFocus) {
		this.courseFocus = courseFocus;
	}
	private void setInitials() {
		String firstNameInitial = firstName.substring(0, 1);
		String lastNameInitial = lastName.substring(0, 1);
		initials = firstNameInitial + lastNameInitial;
	}
	
}






