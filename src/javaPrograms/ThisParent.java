package javaPrograms;

public class ThisParent {
	
	int rollno; 
	String name; 
	float fee; 
	public ThisParent (int r,String n,float f){ 
	 this.rollno=r; 
	this.name=n; 
	this.fee=f; 
	} 
	void display(){System.out.println(rollno+" "+name+" "+fee);} 
	
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
        ThisParent s1=new ThisParent(111,"ankit",5000f); 
        ThisParent s2=new ThisParent(112,"sumit",6000f); 
        s1.display(); 
        s2.display(); 
       
	}
	//  https://www.geeksforgeeks.org/this-reference-in-java/
}
