package a1_new_preparation;

public class ReverseString {
	
	public static void main(String[] args) {
		String str = "Deeptha is BIg master Brain";
		//reverse(str);
		reverseWord(str);
	}
	
	
	public static void reverse(String str) { //deeptha -- ahtpeeD
		
		int len = str.length(); //7
		String res ="";
		int i;
		System.out.println("Actual String --> "+str);
		for(i=len-1;i>=0;i--) { //6 -- 5 --4 --3
			char c = str.charAt(i); // i=6,a -- i=5,h -- i=4,t -- i=3,p
			res = res+c; // a -- ah -- aht -- ahtp
		}
		System.out.println("Reverse String  --> "+res);
	}
	
	public static void reverseWord(String str) {
		System.out.println("Actual String --> "+str);
		String res="";
		int i;
		String[] sa = str.split(" ");
		int len = sa.length;
		for(i=len-1;i>=0;i--) {
			res = res+sa[i]+" ";
		}
		System.out.println("Reverse String  --> "+res);
	}
	
	
	/**
	 * 
	 * We need String --- Deeptha  -- o/p -- ahtpeeD
	 * String ref = "";
	 * Length of String
	 * int i= len-1 --> i--
	 * 	s=  str.charat(i);
	 * Base case is i>=0
	 * ref = ref+s(i);
	 */
	

}
