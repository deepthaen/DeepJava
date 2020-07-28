package a1_new_preparation;

import java.util.ArrayList;
import java.util.Arrays;

public class SortInteger {
	public static void main(String[] args) {
		int[] arr = {24, 6,55,22, 5,10,16 };
		//24, 6,55,22, 5,10,16
		
		sorting(arr);	
	}
	public static ArrayList<Integer> sorting(int[] arr) {
	int len = arr.length;  //Length of array
	  int temp;
	  ArrayList<Integer> list = new ArrayList<>();
	for(int i= 0; i<= len-1; i++) {    
		for (int j = i+1; j < len; j++) {
			if(arr[i] > arr[j]) {  // i = 0, j= 1 24>6, 24>55, 24>22 24>5 24> 10, 24>16,  6>55, 6>
			temp = arr[i];    //  temp = 24   ,  , 24, , 24  , 24, 24 , 
			arr[i] = arr[j];   // i = 6     ,  , 22, 5, 10, 16
			arr[j] = temp;   // j = 24		,  , 24, , 24, 24, 24
		}	
	}
		System.out.println(arr[i]);
		list.add(arr[i]);
	}
	return list;
	}
	/**
	 * 24, 6,55,22, 5,10,16
	 * 
	 * 1st step 
	 * 24 >6 
	 * 		temp =24;
	 * 		arr[0] = 6;
	 * 		arr[1]= 24;
	 * 6,24,55,22,5,10,16
	 * 
	 * 6>55
	 * 6>22
	 * 6>5
	 * 		temp = 6;
	 * 		arr[0] = 5;
	 * 		arr[4]=6;
	 * 5,24,55,22,6,10,16
	 * 5>10
	 * 5>16
	 * ---> i++ -- i=1 ,j=2
	 * 
	 * 24>55--j=2
	 * 24>22 -- j=3
	 * 		temp=24;
	 * 		arr[1] =22;
	 * 		arr[3] = 24;
	 * 5,22,55,24,6,10,16 -- 
	 * i=1,j=4
	 * 22>6
	 * 		temp = 22
	 *      arr[1] = 6
	 *      arr[4] = 22
	 * 5,6,55,24,22,10,16
	 * i=1, j= 5
	 * 6>10
	 * i=1, j=6
	 * 6>16
	 * ---> i++ i=2, j = 3
	 * 5,6,55,24,22,10,16
	 *55>24
	 *       temp = 55
	 *       arr[2] = 24
	 *       arr[3]= 55
	 * 5,6,24,55,22,10,16       
	 */
}

