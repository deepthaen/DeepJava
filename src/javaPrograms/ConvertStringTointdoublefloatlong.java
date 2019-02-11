package javaPrograms;

import java.util.Scanner;

public class ConvertStringTointdoublefloatlong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String ::");
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		//convert string to integer
		int result = Integer.parseInt(str);	
		System.out.println("convert to string to integer ::" + result);
		
		//convert string to float
		float number = Float.parseFloat(str);
		System.out.println("convert to string to float ::" + number);
		
		//convert String to double
		double dValue = Double.parseDouble(str);
		System.out.println("convert to string to double ::" + dValue);
		
		//convert String to long
		long Lvalue = Long.parseLong(str);
		System.out.println("convert to string to long ::" + Lvalue);
		
		
		
		

	}

}
