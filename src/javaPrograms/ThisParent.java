package javaPrograms;

public class ThisParent {
	
	int a;
	int b;
	
	// Parameterized constructor 
	public ThisParent(int c, int d) {
		this.a =c;
		this.b = d;
	}
	 
	public void diplay() {

        //Displaying value of variables a and b 
		System.out.println("a = " + a + "b = " + b) ;
	}
	
	public static void main(String[] args)
	{
        ThisParent TP = new ThisParent(2, 30);
        TP.diplay();
       
	}
	//  https://www.geeksforgeeks.org/this-reference-in-java/
}
