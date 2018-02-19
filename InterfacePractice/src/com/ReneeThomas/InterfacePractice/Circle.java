package com.ReneeThomas.InterfacePractice;

public class Circle implements Shape{
//variables for circle dimension radius
	float radius;
	
	// overloaded constructor
	Circle(float radius){
		this.radius = radius;
	}

	@Override
	public float area() {
		// create the area formula for the circle pi*r^2
		
		return 3.14f * radius * radius;
	}
}
