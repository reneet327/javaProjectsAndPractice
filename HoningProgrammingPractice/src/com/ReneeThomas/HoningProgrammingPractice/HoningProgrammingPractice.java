package com.ReneeThomas.HoningProgrammingPractice;

public class HoningProgrammingPractice {

	public static void main(String[] args) {
		//call animal factory
		
		AnimalFactory animalFactory = new AnimalFactory();
		
		//create a cat
		Animal cat = animalFactory.getAnimal("Cat");
		cat.speak();
		
		Dog d1 = new Dog();
		d1.speak();
		
		Animal cow = animalFactory.getAnimal("Cow");
		cow.speak();
	}

}
