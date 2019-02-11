package testPackage;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fact = 1, i, number =5;
		
		for(i=1; i<number; i++) {
			fact = fact *i;
		}
		System.out.println(fact);

	}

}
