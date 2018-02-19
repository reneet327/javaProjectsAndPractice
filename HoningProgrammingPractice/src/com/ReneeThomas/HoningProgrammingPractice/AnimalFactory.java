package com.ReneeThomas.HoningProgrammingPractice;

public class AnimalFactory {

	//create method
	public Animal getAnimal(String animalType) {
		if(animalType.equalsIgnoreCase("Dog")) {
			return new Dog();
		}else if(animalType.equalsIgnoreCase("Cat")) {
			return new Cat();
	}else if(animalType.equalsIgnoreCase("Cow")) {
		return new Cow();
}else {
	 // factory cannot create an unrecognized object
    System.out.println(animalType + " is not recognized by AnimalFactory.");
    return null;
	}	
  }
}
