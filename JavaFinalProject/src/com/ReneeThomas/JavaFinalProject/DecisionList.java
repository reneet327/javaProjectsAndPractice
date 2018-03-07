package com.ReneeThomas.JavaFinalProject;


public class DecisionList extends TaskList{

	//variables for decision list
	String[] dList = {"1. Add a Task", "2. Remove a Task", "3. Mark a Task Complete", "4. List the Tasks", "5. End Program"};
	String question = "\nWhat would you like to do?";
	int userD;
	boolean end = false;
	
	// Create constructor that prints decision list and get's user input
	DecisionList(){
		while(end != true) {
			for (int i = 0; i < dList.length; i++) {
			System.out.println(dList[i]);
			}
			System.out.println(question);
			
			//get user input
			userD = scan.nextInt();
			userS = scan.nextLine();
			
			//use switch statement to display proper method
			switch(userD) {
			case 1:
				addItem();
				break;
			case 2:
				deleteItem();
				break;
			case 3:
				completeTask();
				break;
			case 4:
				printList();
				break;
			case 5:				
				System.out.println("Good bye!");
				end = true;
				//endProgram();
				break;
			default:
				System.out.println("You must enter a valid choice.");
				
			}
		}
	}
	
	
	
}

