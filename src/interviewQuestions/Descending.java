package interviewQuestions;

import java.util.Scanner;

public class Descending {
	public static void main(String[] args) {
		int temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array range");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter array values");
		for(int i =0 ; i< n; i++) {
			a[i] = s.nextInt();
			}
		
		for(int i = 0; i<n; i++) {
			for(int j = i+1 ; j<n; j++) {
				if(a[i]< a[j]) {
					temp =a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
		System.out.println("Descending order of array");
		for (int i = 0; i< n-1; i++) {
			System.out.print(a[i]+ ",");
			
		}
		System.out.println(a[n-1]);
	

}
}