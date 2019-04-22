package interviewQuestions;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// how to reverse each word in string 
//		Given string “ I LIVE LONG LIFE“
//		OUTPUT = “I EVIL GNOL EFIL”
		
		String str = "I LIVE LONG LIFE" ;
		
		String[] strspt = str.split(" ");
		
		int len = strspt.length;
		
		for(int j = 0 ; j< len; j++) {
			
			char[] ch = strspt[j].toCharArray();
			
			for(int i =ch.length-1 ; i>=0 ; i--) {
				
			System.out.print(ch[i]);
		}
		
	System.out.print(" ");
		
		

	}

	}}
