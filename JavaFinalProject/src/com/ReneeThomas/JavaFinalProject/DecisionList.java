package com.ReneeThomas.JavaFinalProject;
import java.util.Scanner;

public class DecisionList {

	//variables for decision list
	String[] dList = {"1. Add a Task", "2. Remove a Task", "3. Mark a Task Complete", "4. List the Tasks"};
	String question = "\nWhat would you like to do?";
	
	// Create constructor that prints decision list and get's user input
	DecisionList(){
		
		for (int i = 0; i < dList.length; i++) {
		System.out.println(dList[i]);
		}
		System.out.println(question);
		
		
	}
}
