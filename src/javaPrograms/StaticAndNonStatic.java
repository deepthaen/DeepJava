package javaPrograms;

public class StaticAndNonStatic {

	// non static method with no return
	public void display() {
		System.out.println("Display non static non returnable method");
	}
	//non static methods with returnable 
	public int products(int x, int y ) {
		return x+y;
	}
	
	static void values() {
		System.out.println("calling from main class");
		}
    
	static int displayValues(int x, int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = StaticAndNonStatic.displayValues(30, 55);
		System.out.println(res);
		StaticAndNonStatic.values();
		
		NonStaticMethods NSM = new NonStaticMethods();
		NSM.display();
		
		int ans = NSM.products(20,50);
		System.out.println(ans);
		test NSME = new test();
		NSME.geek();
		int val = test.geekValue(30, 50);
		System.out.println(val);
		 
	}	
	}

     class test  {
    	 void geek() {
    	 System.out.println("calling from diff class");
    	 }
    	 static int geekValue(int x, int y) {
    		 return x*y;
    		 
    	 }
          
}
