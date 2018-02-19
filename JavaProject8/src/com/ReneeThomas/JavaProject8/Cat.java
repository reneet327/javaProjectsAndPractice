package com.ReneeThomas.JavaProject8;

public class Cat implements Mammal {


	//variables
	String sound = "Meow!";
	int speed = 30;
	String food = "mice";

	@Override
	public void speak() {
		//print sound
		System.out.println(sound);
	}

	@Override
	public void run() {
		// print the speed of the cat
		System.out.println("Cats can run at a top speed of " + speed  +" mph!"
);
	}
	
	@Override
	public void eat() {
		// print the food of the cats
				System.out.println("Cats eat " + food  +"."
		);
	}

}
