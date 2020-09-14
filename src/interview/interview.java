package interview;

import java.util.Scanner;

public class interview {
	
	//input user int 5 
	
	public static void main(String[] args) {
		//int[] a = {28,3,5,7,3,600,8};
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int a[] = new int[n];
		System.out.println("Element no of element ");
		
		for(int i=0; i<n; i++ ) {
	         a[i] = sc.nextInt();
	      }

	     		
		int  val = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>val){
				val = a[i];
				
			}
			
		}
		System.out.println("Largest Value in Array ="  + val);
	}

}
