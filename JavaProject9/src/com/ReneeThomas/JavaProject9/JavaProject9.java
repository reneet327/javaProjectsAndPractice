package com.ReneeThomas.JavaProject9;

public class JavaProject9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			CatFactory cf = new CatFactory();			
			Animal cat1 = cf.createCat("Roxie", "Tabby");
			
			DogFactory df = new DogFactory();
			Animal dog1 = df.createDog("Poochy", "Poodle");
			
			CowFactory cowf = new CowFactory();
			Animal cow1 = cowf.createCow("Bessie");
			Cow cow2 = cowf.createCow("Bonnie");
	}

}
