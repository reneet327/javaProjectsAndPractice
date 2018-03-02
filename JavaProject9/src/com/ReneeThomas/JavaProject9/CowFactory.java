package com.ReneeThomas.JavaProject9;

public class CowFactory {
//create cow factory method
	public Cow createCow(String name) {
		return new Cow(name);
	}
}
