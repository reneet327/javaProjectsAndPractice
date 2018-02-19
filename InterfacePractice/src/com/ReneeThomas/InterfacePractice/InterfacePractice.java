package com.ReneeThomas.InterfacePractice;

public class InterfacePractice {

	public static void main(String[] args) {
		// create a variable for the square length
		float squareLength = 3f;
		
		//create new object square
		Square s1 = new Square(squareLength);
		
		//create variable for area
		float area = s1.area();
		
		//print area to the console
		System.out.println(area);
		
		// create circle instance
		
		// create a variable for the square length
				float circleRadius = 3f;
				
				//create new object square
				Circle cir = new Circle(circleRadius);
				
				//create variable for area
				float area2 = cir.area();
				
				//print area to the console
				System.out.println(area2);
		
		

	}

}
