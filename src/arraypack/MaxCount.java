package arraypack;

public class MaxCount {

	
	public static void main(String[] args) {
		String s = "asdsasasdas";
		
		int len = s.length();
		int count =0;
		char[] ch = s.toCharArray();
		for (int i = 0; i <=ch.length; i++) {
			for (int j = 1; j < ch.length; j++) {
				if (ch[i]==ch[j]) {
					count++;
					
				}
			}
			System.out.println(count);
		}
	
	}
}
