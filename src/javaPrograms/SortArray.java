package javaPrograms;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {
	public static void main(String[] args) {
		
		//Sort array in ascending
		int[] arr = { 24, 6,55,22, 5,0 };
		Arrays.sort(arr);
		
		System.out.printf("Ascending order array ::: %s  ",Arrays.toString(arr));  
	
	
	
		 // Sorts arr[] in descending order 
	 Integer[] arrD = {13, 7, 6, 45, 21, 9, 2, 100}; 
	  
      Arrays.sort(arrD, Collections.reverseOrder()); 

     System.out.printf("Modified arr[] : %s", 
                       Arrays.toString(arrD)); 
}}
