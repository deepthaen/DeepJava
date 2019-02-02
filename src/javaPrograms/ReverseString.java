package javaPrograms;

import java.util.Scanner;

public class ReverseString 
{
	
	public static void main (String[] args)
	{
		System.out.println("Enter String ;;");
		Scanner sc = new Scanner(System.in);
		String si= sc.next();
		
		//without String Function
		for(int i = si.length()-1; i>=0; i--) 
		{
			System.out.println("Reverse String ::" + si.charAt(i) );
		}
		
		//with string function
		String rev = new StringBuilder(si).reverse().toString();
		System.out.println("Reversed String ::"  + rev);
		
	}

}
