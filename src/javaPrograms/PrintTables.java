package javaPrograms;

import java.util.Scanner;

public class PrintTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter number to for tables");
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		
		for(int i = 1; i<= 10; i++) {
			int tab = n*i ;
			System.out.println(n+ "*"+i + "="  +tab);
		}
		

	}

}
