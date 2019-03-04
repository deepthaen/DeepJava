package javaPrograms;

import java.util.Scanner;

public class MatrixThree {

	int matrix[][];
	int row, column;
	void Create() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Number of rows ::");
		row = Integer.parseInt(sc.nextLine());
		System.out.println("Number of columns :");
		column = Integer.parseInt(sc.nextLine());
		matrix = new int[row][column];
		System.out.println("Enter the data :");
		for(int i=0; i< row; i++) {
			for(int j=0; j< column; j++) {
				matrix[i][j]= sc.nextInt();
				
				
			}
		}
	}
		void display() {
			System.out.println("\nThe Matrix is :");
			for(int i=0; i < row; i++) {
				for(int j=0; j < column; j++) {
					System.out.print("\t" + matrix[i][j]);
				}
				System.out.println();
			
		}
		
	

}}