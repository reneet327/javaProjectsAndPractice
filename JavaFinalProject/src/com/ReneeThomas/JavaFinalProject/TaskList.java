package com.ReneeThomas.JavaFinalProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TaskList {

	//variables
	List<String> list = new ArrayList<String>();
	Scanner scan = new Scanner(System.in);
	int userI;
	String userS;
	String whichItem = "Please input the item you would like to add type \"x\" when finished.";
	String whichComplete = "Enter the number of the item you wish to complete.";
	String whichDelete = "Enter the number of the item you wish to delete. ";
	
	
	// constructor
	public TaskList() {
		for(int i = 0; i< list.size(); i++)
		System.out.println(i+1 + ". " + list.get(i));		
	}
	
	public void addItem() {
		//Ask user which item they want to add
		System.out.println(whichItem);
		
		//start loop
		while(!"x".equals(userS)){
		userS = scan.nextLine();
		
		//check to see if user input an x before adding to list
			if (!"x".equals(userS)) {
				list.add(userS);
			}
		}
		//print new list
		printList();
	}
	
	public void deleteItem() {
		//print list
		printList();
		
		//ask user which item the want to delete
		System.out.println(whichDelete);
		
		//get user input
		userI = scan.nextInt();
		
		//call delete method
		delete(userI);
		
		//print new list
		printList();
		
	}
	
	public void delete(int r) {
		list.remove(r - 1);
	}
	
	public void printList() {
		for(int i = 0; i< list.size(); i++) {
			System.out.println(i+1 + ". " + list.get(i));			
		}
		System.out.println();
	}
	
	public void completeTask() {
		//print current list
		printList();
		
		//Ask user which item to mark complete
		System.out.println(whichComplete);
		
		//get user input
		userI = scan.nextInt();
		
		//mark list item complete
		complete(userI);
		
		//print the new list showing the completed item
		printList();
		
	}
	
	public void complete(int c) {
		//create variable to get and store item c
		String origTask = list.get(c-1);
		
		//re-set the task list in origTask and include (complete)
		list.set(c-1, origTask + "(Complete)");
		}
	
}

	
	
	
	

