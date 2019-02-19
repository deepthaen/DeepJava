package javaClasses;

public class FiveConstructor {
	

	
	
	public FiveConstructor() {
		System.out.println("Constructor One");
	
}
	public FiveConstructor(int x) {
		
			 System.out.println("Constructor Two" +x);	 
		 }
	
	
	public FiveConstructor(int x, int y) {
		
		 int z = x+y;
			System.out.println("Constructor Three"+ z);
	}
	
	public FiveConstructor(String a) {
		
		
				System.out.println("Constructor Four" +a);
			}
		
	public FiveConstructor(double d) {
					System.out.println("Constructor Five" +d);
				}
			
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FiveConstructor FC = new FiveConstructor();
		FiveConstructor FCOne = new FiveConstructor(5);
		FiveConstructor FCTwo = new FiveConstructor(5,10);
		FiveConstructor FCThree = new FiveConstructor("Deep");
		FiveConstructor FCFour = new FiveConstructor(32222);
		
		
		
		

	}

}
