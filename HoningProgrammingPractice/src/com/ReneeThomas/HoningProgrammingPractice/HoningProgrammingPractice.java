package com.ReneeThomas.HoningProgrammingPractice;

public class HoningProgrammingPractice {

	public static void main(String[] args) {
		//call animal factory
		
		//AnimalFactory animalFactory = new AnimalFactory();
		
		//create a cat
		/*Animal cat = animalFactory.getAnimal("Cat");
		cat.speak();
		
		Dog d1 = new Dog();
		d1.speak();
		
		Animal cow = animalFactory.getAnimal("Cow");
		cow.speak();
	}*/
		
	//Builder...
		// simple Employee object using only mandatory parameters
	    //Employee johnEmployee = new Employee.EmployeeBuilder("John", "Smith", "Writer", 50000f).build();
	    //System.out.println(johnEmployee.getFirstName() + " " + johnEmployee.getLastName() + " makes " + johnEmployee.getSalary() + " as a " + johnEmployee.getJobTitle());
	    
	    // complex Employee object using additional setters from EmployeeBuilder class
	    //Employee patEmployee = new Employee.EmployeeBuilder("Pat", "Green", "Chemist", 70000f).setPhoneNumber("555-123-4567").setStreetAddress("123 Alphabet St.").setCity("Tempe").setState("Arizona").setZip(85281).build();
	    //System.out.println(patEmployee.getFirstName() + " " + patEmployee.getLastName() + " makes " + patEmployee.getSalary() + " as a " + patEmployee.getJobTitle() + " and lives in " + patEmployee.getCity() + ", " + patEmployee.getState());
	
	//Employee2 Builder from module
		Employee2 johnEmployee = new Employee2.EmployeeBuilder("John", "Smith", "Writer", 50000f).build();
	    System.out.println(johnEmployee.getFirstName() + " " + johnEmployee.getLastName() + " makes " + johnEmployee.getSalary() + " as a " + johnEmployee.getJobTitle());
	    
	    // complex Employee object using additional setters from EmployeeBuilder class
	    Employee2 patEmployee = new Employee2.EmployeeBuilder("Pat", "Green", "Chemist", 70000f).setPhoneNumber("555-123-4567").setStreetAddress("123 Alphabet St.").setCity("Tempe").setState("Arizona").setZip(85281).build();
	    System.out.println(patEmployee.getFirstName() + " " + patEmployee.getLastName() + " makes " + patEmployee.getSalary() + " as a " + patEmployee.getJobTitle() + " and lives in " + patEmployee.getCity() + ", " + patEmployee.getState());
	}

	}

	
	
	}

