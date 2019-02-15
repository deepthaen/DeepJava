package javaPrograms;

import java.util.Scanner;

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter String one::");
		Scanner  sc1 = new Scanner (System.in);
		String str1 = sc1.nextLine();
		
		System.out.println("Enter String two::");
		Scanner  sc2 = new Scanner (System.in);
		String str2 = sc2.nextLine();
		
		if (str1.equals(str2)) {
			System.out.println("Strings are equals");
		}else {
			System.out.println("Strings are not equals");
		}
		
		
		

	}

}
