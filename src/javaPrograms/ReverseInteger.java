package javaPrograms;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Integer ::");
		Scanner sc = new Scanner(System.in);
		int si = sc.nextInt();
				
		//Convert integer to string
		String s = Integer.toString(si);
		
		for(int i = (s.length()-1); i>=0; i--)
		{
			System.out.println("Revered Integr :: " + s.charAt(i));
		}

}
}