package com.ReneeThomas.JavaProject8;

public class Cow implements Mammal{


	//variables
	String sound = "Moo!";
	int speed = 25;
	String food = "grass";

	@Override
	public void speak() {
		//print sound
		System.out.println(sound);
	}

	@Override
	public void run() {
		// print the speed of the cow
		System.out.println("Cows can run at a top speed of " + speed  +" mph!"
);
	}
	
	@Override
	public void eat() {
		// print the food of the cow
				System.out.println("Cows eat " + food  +"."
		);
	}

}
