package pratice;

public class ReverseSent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "My name is Deeptha";
		
		String[] strspt = str.split(" ");
		
		for(int i = 0; i< strspt.length; i++ ) {
			char[] ch = strspt[i].toCharArray();
			
		for (int j = ch.length-1; j>=0; j-- ) {
			System.out.print(ch[j]);
		}
		System.out.println(" ");
		}
		
	

	}

}
