package arraypack;

public class Strinarr {
	
	
	public static void main(String[] args) {
		
		String s = "my name is deeptha";
		
		String[] sarray = s.split(" ");
		for (int i = 0; i < sarray.length; i++) {

			char[] va = sarray[i].toCharArray();	
			for (int j = va.length-1; j>=0; j--) {
				System.out.print(va[j]);
			}
			
			System.out.println("");
		}
	
	}

}
