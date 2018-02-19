package com.ReneeThomas.JavaProject6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaProject6 {

	public static void main(String[] args) {
		
		// Use String Builder to create a comma delimited string of array songs
		String songs[] = {"Rock With You", "Smooth Criminal", "Wanna Be Startin' Something", "Thriller", "Beat It"};
	    StringBuilder sb = new StringBuilder();
	    // loop through all of the cities
	    for(int i = 0; i < songs.length; i++){
	        // concatenate the city names
	        sb.append(songs[i]);
	        // concatenate a comma between each city name for increased readability
	        sb.append(", ");
	    }
	    System.out.println(sb);
	    
	    
	    
	    BufferedReader reader;
	    FileWriter writer;
	    String readContents = "";

	    // attempt to run code that may cause an error
	    try{
	    	// open the file for writing
	    	writer = new FileWriter("songs.txt");
	    	// write the sb string inside of the file
	    	writer.write(sb.toString());
	    	// close the file (finished writing)
	    	writer.close();
	    	
	    	// open the file for reading
	    	reader = new BufferedReader(new FileReader("songs.txt"));
	    	String line;
	    	while ((line = reader.readLine()) != null) {
	    		readContents = readContents + line;
	    	}
	    	// close the file (finished reading)
	    	reader.close();
	    }
	    // catch errors that happened in the try block
	    catch(Exception e){
	    	// print the stack trace (error)
	    	e.printStackTrace();
	    }
	    finally{
	    	System.out.println(readContents);
	    }

	}

}
