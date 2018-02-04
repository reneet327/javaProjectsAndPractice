package com.ReneeThomas.objectClassPractice;

public class objectClassPractice {

	public static void main(String[] args) {
		//test both types of constructors
		student student1 = new student();
		student student2 = new student("Renee", "Thomas", "Java");
		
		// create a variable to input the first name of student 2
		String firstNameStudent2 = student2.getFirstName();
		System.out.println(firstNameStudent2);
		
		//change first name of object then print it out
		
		// create a variable to input the first name of student 2
		student2.setFirstName("Susan");
		System.out.println(student2.getFirstName());
		
		//create 3 new students using the default constructor
		student studentA = new student();
		student studentB = new student();
		student studentC = new student();
		
		//set names and focus for all students using setter methods
		studentA.setFirstName("William");
		studentA.setLastName("Diamond");
		studentA.setCourseFocus("Drums");
		
		studentB.setFirstName("Winston");
		studentB.setLastName("Pintor");
		studentB.setCourseFocus("Sales");
		
		studentC.setFirstName("Alexa");
		studentC.setLastName("Abalos");
		studentC.setCourseFocus("Nursing");
		
		//print out all the new names and focus using getter methods
		
		//create variable for string message
		String msg1 = "New student Details: ";
		String name = "Name: ";
		String course = " Course: ";
		System.out.println(msg1 + name + studentA.getLastName() + ", " + studentA.getFirstName() + "("+ studentA.getInitials() + ")" + course + studentA.getCourseFocus());
		System.out.println(msg1 + name + studentB.getLastName() + ", " + studentB.getFirstName() + "("+ studentB.getInitials() + ")" + course + studentB.getCourseFocus());
		System.out.println(msg1 + name + studentC.getLastName() + ", " + studentC.getFirstName() + "("+ studentC.getInitials() + ")" + course + studentC.getCourseFocus());


	}

}
