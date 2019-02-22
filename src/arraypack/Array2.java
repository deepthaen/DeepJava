package arraypack;

import java.util.ArrayList;

public class Array2 {
	
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		int[] i = {1,2,30,-1,-3,0};
		int[] val = null;
		int returnval = 0;
		for (int j = 0; j < i.length; j++) {
			int even = returnEven(i[j]);
			 a.add(even);
		}
		System.out.println(a);
	}

	
	public static int returnEven(int i) {
		if(i%2 == 0) {
			return i;
		}
		return 0;
		
	}
}
