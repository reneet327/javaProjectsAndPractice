package com.ReneeThomas.ArrayPractice;


public class ArrayPractice {

	public static void main(String[] args) {
		// variables
		/*String [] students = {"Joshua Alexander", "Carol Thomas", "Marion Green", "Edward Johnson", "Katherine Jones", "Jared Williams"};
		
		//print the first name in the array
		System.out.println(students[0]);
		*/
		
		//grocery list array calling out the number of items in an array
		/*
		String[] groceryList = new String[4];
		groceryList[0] = "bread";
		groceryList[1] = "eggs";
		groceryList[2] = "milk";
		groceryList[3] = "tea";
		groceryList[1] = "beans";
		System.out.println(groceryList[1]);
		*/
		
		//loops
		//variables
		boolean keepLooping = true;
		String userInput;
	//loop through the following code
	while(keepLooping) {
		// my input: "Hi!"
		System.out.println("Enter a number");
		userInput = StudentHelper.ReadInputString();
		//if user input "quit" set keepLooping to false
		if(userInput.equals("quit")){
			keepLooping = false;
		// else keep looping stays true and echo's the user input
		}else {		
	    System.out.println("\nEcho: " + userInput);		
		}
	}
	
	}

}
