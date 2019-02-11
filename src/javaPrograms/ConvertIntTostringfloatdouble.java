package javaPrograms;

import java.util.Scanner;

public class ConvertIntTostringfloatdouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Integer");
		
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		//COnvert int to string 
		String str = Integer.toString(s);
		System.out.println("convert int to string :: " + str);
		
		//convert int to float
		float newValue = (float) s;
		System.out.println("convert int to float ::" + newValue);
		
		//convert int to double
		double dValue = (double) s;
		System.out.println("convert int to double ::" + dValue);
		
		
		
		

	}

}
