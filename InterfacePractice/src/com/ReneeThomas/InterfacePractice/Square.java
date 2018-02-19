package com.ReneeThomas.InterfacePractice;

public class Square implements Shape {
// create the square class that will give the side length
	float length;
	
// overloaded constructor
	public Square(float len) {
		length = len;
	}

@Override
public float area() {
	//write the function to find the area of a square
	
	return length * length;
}
}
