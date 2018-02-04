package com.reneethomas.JavaProject1;

public class JavaProject1 {

	public static void main(String[] args) {
		//variables
		boolean isSunny=true;
		boolean atBeach=true;
		//if isSunny is true print "Don't forget your sunglasses."
		if(isSunny) {
			System.out.println("Don't forget your sunglasses.");
			//if isSunny is true and atBeach is true print "You'll need sunblock too."
			if(atBeach) {
				System.out.println("You'll need sunblock too.");
			//if isSunny is true and atBeach is false print "You're not at the beach, so you don't have to worry about sunblock."
			}else {
				System.out.println("You're not at the beach, so you don't have to worry about sunblock.");
				}
		
		//if isSunny is false print "You won't be needing your sunglasses today."	
		}else {
			System.out.println("You won't be needing your sunglasses today.");
			//if isSunny is false and atBeach is true print "Let's come back to the beach tomorrow."
		}	if(atBeach) {
				System.out.println("Let's come back to the beach tomorrow.");
			//if isSunny is false and atBeach is false print "No need to go to the beach today."
			}else {
				System.out.println("No need to go to the beach today.");
		}

	}

}
