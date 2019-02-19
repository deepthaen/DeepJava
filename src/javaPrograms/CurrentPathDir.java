package javaPrograms;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CurrentPathDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Path currentRelativePath = Paths.get("");
		String s = currentRelativePath.toAbsolutePath().toString();
		System.out.println("Current relative path is: " + s);
	}

}
