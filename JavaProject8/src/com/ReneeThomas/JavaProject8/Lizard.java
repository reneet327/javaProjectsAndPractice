package com.ReneeThomas.JavaProject8;

public class Lizard implements Reptile {

	@Override
	public void eat() {
		// print out what a lizzard eats
		System.out.println("Lizards eat crickets.");
		
	}

	@Override
	public void crawl() {
		// print out how fast lizzards can crawl
				System.out.println("Lizards can crawl up to 5ft per min.");
	}

}
