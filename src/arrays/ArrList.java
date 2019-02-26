package arrays;

import java.util.ArrayList;

public class ArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(8);
		a.add(9);
		a.add(10);
		a.add(10);

		int sum = 0;
		for (int i : a) {
			
			int val = a.get(i-1);
			System.out.println(val); 
			
			sum = sum + i;
		}
		
		System.out.println("ArrayList sum of 10 number :: " + sum);
		
		a.remove(4);
	System.out.println("removed 4 th index :: " +a);
	
	a.set(8, 11);
	System.out.println(a);
	
	//number of elemnets in array
	a.size();
	System.out.println("size"+a);
	
	if(a.isEmpty()) {
		System.out.println("empty");
	}else {
		System.out.println("Not Empty");
	}
	
	ArrayList<String>  As = new ArrayList<String>();
	As.add("Ad");
	As.add("dd");
	As.add("rr");
	
	
	for(String i: As) {
		System.out.println("Array Lsit"  + i);

	}
	}

	
	
	
}
