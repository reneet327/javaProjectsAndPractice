package com.ReneeThomas.JavaProject7;

public class JavaProject7 {

	public static void main(String[] args) {
		//instantiate employees
		Manager m1 = new Manager("Will", "Diamond", "Noble Elementary", 13, 555555555 );
		Manager m2 = new Manager();
		
		System.out.println(m1.toString());
		
		Engineer e1 = new Engineer();
		Designer d1 = new Designer();
		
		d1.setFirstName("Renee");
		d1.setLastName("Thomas");
		d1.setCompanyTitle("RT Grafix");
		d1.setYearsAtCompany(14);
		d1.setSSN(222222222);
		
		System.out.println(d1.toString());
		System.out.println(e1.toString());
	}

}
