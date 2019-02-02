package javaPrograms;

public class StaticMethods {
	
	static void staticExmp() {
		System.out.println("Excuting static method with any arg");
	}
	
	static void staticExmpTwo() {
		System.out.println("Excuting static method ");
	}
	
	static void staticParmtr(String name) {
		System.out.println("name is ::" + name);		
	}
	
	static double staticRtrn(int x, double y) {
		return x+y;
		}
	
		public static void main(String[] args) {
			staticExmp();
			staticExmpTwo();
			staticParmtr("Deep");
	     	double z = staticRtrn( 55,99.5);
	     	System.out.print(z);
			
			
			
	}

}
