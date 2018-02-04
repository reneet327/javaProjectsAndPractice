package com.ReneeThomas.JavaProject2;

public class JavaProject2 {

	public static void main(String[] args) {
		//variables
		int age=25;
		String message = "Your ticket will be ";
		boolean isStudent = true;
		
		// if age is a positive number move forward
		if(age < 0) {
			System.out.println("You must enter a real age.");		
		// if senior citizen, pay $7
		}else if(age>=65) {
			System.out.println(message +"$7.");
		// if child, pay $8 	
		}else if(age <= 12 || isStudent) {
			System.out.println(message + "$8.");
		// everyone else, pay $10
		}else {
			System.out.println(message + "$10.");
		}	

		

		

	}

}
