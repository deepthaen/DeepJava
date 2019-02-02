package javaPrograms;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Duplicate Number
				System.out.println("Enter number");
				int arr[] = {2,4,24,56,2,3,4};
				int arr_size = arr.length;
				
				for(int k = 0; k<arr_size; k++)
				{
					for (int l = k+1 ; l < arr_size; l++)
					{
						if (arr[k]==arr[l])
						{
							System.out.println("duplicate number" + arr[k]);
						}
					}
				}
	}

}
