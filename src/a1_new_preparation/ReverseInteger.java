package a1_new_preparation;

public class ReverseInteger {
	
	public static void main(String[] args) {
		
	
	int i = 12345, res=0;
	
	while(i!=0) {
		int digit = i%10;
		res = res*10+digit ;
		i = i/10;
		
	}
	System.out.println(res);

}
}