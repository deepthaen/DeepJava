package javaPrograms;

import java.util.Scanner;

public class SwapStringWithVariable {

	public static void main(String args[]) {
		
		System.out.println("Enter Strings ::");
		 Scanner sc1 = new Scanner(System.in);
		 String str1 = sc1.next();
		 
		 Scanner sc2 = new Scanner(System.in);
		 String str2 = sc2.next();
		 
		 System.out.println("Before Swap : "+str1+"    " + str2 );
		 
		 String temp;
		 
		 temp = str1;
		 str1 = str2;
		 str2 = temp;
		 System.out.println("After Swap : "+str1+"    " + str2 );
		 
	}
}
