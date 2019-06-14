package pratice;

import java.util.Scanner;

public class Ascend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range of array");
		int r = sc.nextInt();
		int a[] = new int[r];
		System.out.println("Enter array for ascending order");
		for (int i = 0; i<r; i++) {
			a[i]=sc.nextInt();
			
		}
		for(int i = 0 ; i< r; i++) {
			for (int j = i+1; j<r; j++)
			{  if(a[i]> a[j]) {
				temp = a[i];
				a[i] =a[j];
				a[j] = temp;
			}
				}
			}
		System.out.println("Ascedind order");
		for (int i = 0; i< r; i++) {
			System.out.print(a[i] + ",");
			
			
		}
		System.out.println(" ");
		
		

	}

}
