package javaPrograms;

import java.util.Scanner;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 System.out.println("Enter Strings ::");
	 Scanner sc1 = new Scanner(System.in);
	 String str1 = sc1.next();
	 
	 Scanner sc2 = new Scanner(System.in);
	 String str2 = sc2.next();
	 
	 System.out.println("Before Swap : "+str1+"    " + str2 );
	 
	 str1 = str1 + str2;  
     str2 = str1.substring(0, str1.length() - str2.length());  
     str1 = str1.substring(str2.length()); 
     System.out.println("After swapping" + str1 + "  " + str2);
	 
	 	}

}
