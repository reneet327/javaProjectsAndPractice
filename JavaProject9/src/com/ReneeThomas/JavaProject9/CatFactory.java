package com.ReneeThomas.JavaProject9;

public class CatFactory {
	//create method to create new cat
	public Cat createCat(String name, String breed) {
		return new Cat(name, breed);
	}
}
