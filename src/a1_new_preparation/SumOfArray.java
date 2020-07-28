package a1_new_preparation;

public class SumOfArray {
	public static void main(String[] args) {
		int i =654323452;
		sumofArray(i);
	}



public static void sumofArray(int val) {
	
	int amt = splitInt_sum(val);
	System.out.println(amt);
		while(amt>9) {
			amt =splitInt_sum(amt);
			System.out.println(amt);
		}
	
}


public static int splitInt_sum(int val) {
	int digit=0;
	int sum=0;
	while(val>0) {//1234
		digit = val%10; //4 -- 3 --2 --1
		sum= sum+digit;
		val = val/10; //123 --12 --1 -0
	}
	return sum;
}

}