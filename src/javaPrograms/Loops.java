package javaPrograms;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sum of natural number 
		int sum =0;
		for(int i = 1; i <= 50; i++) {
			sum += i;
		}
         System.out.println("sum of for loop "+sum);
         
         
         //for Each loop its works for to work with arrays and collections
         
         /*  for(data_type item : collection) {
              ...
                }  */
         
         int arr[] = {2,4,5,6,3};
         for(int j : arr) {
        	 sum += j;
         }
        System.out.println("sum of for each loop " + sum); 
	}

}
