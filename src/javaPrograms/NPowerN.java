package javaPrograms;

import java.util.Scanner;

public class NPowerN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);
		int b = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		int exp = sc2.nextInt();
		
		int res = 1;
		
		for(; exp != 0; --exp) {
			res *=b;
			
		}
		System.out.println("n powe n ::" +res);
		
		

	}

}
