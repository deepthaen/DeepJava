package a1_new_preparation;

public class SortDescending {
	public static void main(String[] args) {
		int[] arr = {24, 6,55,22, 5,10,16 };
		
		int len = arr.length;  //Length of array
		  int temp;
	
	for(int i= 0; i<= len-1; i++) {    
		for (int j = i+1; j < len; j++) {
			if(arr[i] < arr[j]) { 
			temp = arr[i];    
			arr[i] = arr[j];   
			arr[j] = temp;   //
		}
		}	
	System.out.println("Descending"+arr[i]);
	}
	}
}
		
	
	


