package com.ReneeThomas.JavaProject9;

public class Animal {

	// name of the animal
		private String name;
		private int age;
		
		public Animal() {
			name = "";
			age = 0;
		}
		
		public Animal(String name) {
			this.name = name;
			age = 0;
		}
		
		public String getName() {
			return name;
		}
		
		public int getAge() {
			return age;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void setAge(int age) {
			this.age = age;
		}

}
