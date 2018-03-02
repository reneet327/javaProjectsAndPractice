package com.ReneeThomas.JavaProject9;

public class DogFactory {
// create dog factory method
	public Dog createDog(String name, String breed) {
		return new Dog(name, breed);
	}
}
