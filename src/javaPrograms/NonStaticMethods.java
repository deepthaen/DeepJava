package javaPrograms;

public class NonStaticMethods {
	
	// non static method with no return
	public void display() {
		System.out.println("Display non static non returnable method");
	}
	//non static methods with returnable 
	public int products(int x, int y ) {
		return x+y;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NonStaticMethods NSM = new NonStaticMethods();
		NSM.display();
		
		int ans = NSM.products(20,50);
		System.out.println(ans);
		NonStaticMethodsEXmp NSME = new NonStaticMethodsEXmp();
		NSME.geek();
		
	}

}
     class NonStaticMethodsEXmp {
    	 
    	 void geek() {
    	 System.out.println("calling from diff class");
    	 }
         
    
	
    	 
}
