package com.ReneeThomas.JavaProject8;

public class Dog implements Mammal {
	
	//variables
	String sound = "Bark!";
	int speed = 45;
	String food = "Bones";

	@Override
	public void speak() {
		//print sound
		System.out.println(sound);
	}

	@Override
	public void run() {
		// print the speed of the dog
		System.out.println("Dogs can run at a top speed of " + speed  +" mph!"
);
	}

	@Override
	public void eat() {
		// print the food of the dog
				System.out.println("Dogs eat " + food  +"."
		);
	}

}
