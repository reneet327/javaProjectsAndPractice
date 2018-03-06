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
	
	
	// constructor
	public TaskList() {
		for(int i = 0; i< list.size(); i++)
		System.out.println(i+1 + ". " + list.get(i));
		
	}
	
	public void addItem() {
		//Ask user which item they want to add
		System.out.println(whichItem);
		do {
		userS = scan.nextLine();
		list.add(userS);	
		}while(userS != "x" );
		printList();
	}
	
	public void deleteItem() {
		//print list
		printList();
		//ask user which item the want to delete
		System.out.println("Which item do you wish to delete?");
		
	}
	
	public void delete(int r) {
		list.remove(r);
	}
	
	public void printList() {
		for(int i = 0; i< list.size(); i++)
			System.out.println(i+1 + ". " + list.get(i));
		System.out.println();
	}
	
	public void complete(int c) {
		//create variable to get and store item c
		String origTask = list.get(c-1);
		list.set(c-1, origTask + "(Complete)");
		
	}
	
	
		
}
	
	

