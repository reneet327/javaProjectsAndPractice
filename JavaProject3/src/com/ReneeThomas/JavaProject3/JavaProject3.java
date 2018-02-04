package com.ReneeThomas.JavaProject3;

import java.util.Scanner;

public class JavaProject3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables
		int[] numArray = new int[5];
		String instructions = "Enter a number: ";
		
		//create a for loop to insert userInput into numArray
		for(int i=0; i<5; i++) {
			//print the enter number instructions
			System.out.println(instructions);
			//user inputs number
			Scanner scan = new Scanner(System.in);
			//grab user input and put it into array via i
			numArray[i] = scan.nextInt();		
		}
		// print message to let you know you're out of the loop
		System.out.println("Got it!");
		
		System.out.println("\n\nThe numbers you input were: ");
		
		//create a for loop to print out the numArray
		for(int i = 0; i< numArray.length; i++) {
			System.out.println(numArray[i]);
		}
		

	}

}
