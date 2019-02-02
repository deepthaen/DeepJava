package javaPrograms;

import java.util.Scanner;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DUplicate Character
		System.out.println("ENter String ::");
		Scanner sc = new Scanner(System.in);
		String si = sc.next();
		char[] ch = si.toCharArray();
		
		for (int i = 0 ; i < ch.length; i++)
		{
			for (int j = i+1; j< ch.length; j++ )
			{
				if (ch[i]== ch[j]) {
					System.out.println("Duplicate char :: " + ch[i]);
				}
			}
		}
		
		
		
	}

}
