package javaPrograms;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CurrentPathDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Path currentAbsolutePath = Paths.get("");
		String s = currentAbsolutePath.toAbsolutePath().toString();
		System.out.println("Current absolute path is: " + s);
		
		
		
		
		
		
	}

}
