package a1_new_preparation;

public class FindIntOrString {
	
	public static void main(String[] args) {
				
		String str = "6422ss6780";
		convert(str);
		}
		
		
	public static void convert(String str) {
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			try {
				Integer.parseInt(String.valueOf(c));//convert string to integer
				//System.out.print(" "+c);
			} catch (Exception e) {
				System.out.println(c);
			}
			
			
		}
	}

}
