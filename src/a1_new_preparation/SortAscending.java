package a1_new_preparation;

public class SortAscending {
	
	public static void main(String[] args) {
		int[] arr = {24, 6,55,22, 5,10,16 };
		
		int len = arr.length;  //Length of array
		  int temp;
	
	for(int i= 0; i<= len-1; i++) {    
		for (int j = i+1; j < len; j++) {
			if(arr[i] > arr[j]) {  // i = 0, j= 1 24>6, 24>55, 24>22 24>5 24> 10, 24>16,  6>55, 6>
			temp = arr[i];    //  temp = 24   ,  , 24, , 24  , 24, 24 , 
			arr[i] = arr[j];   // i = 6     ,  , 22, 5, 10, 16
			arr[j] = temp;   // j = 24		,  , 24, , 24, 24, 24
		}
		}	
	System.out.println(arr[i]);
	}
	}
}