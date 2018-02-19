package com.ReneeThomas.JavaProject8;

public class Turtle implements Reptile {

	@Override
	public void eat() {
		System.out.println("Turtles eat lettuce.");
		
	}

	@Override
	public void crawl() {
		// Print how fast they are
		System.out.println("Turtles can crawl up to 2 feet per min.");
	}

}
