package javaPrograms;

public class Child extends SuperClass {
	
	String color = "white";
	
	//super can be used to refer immediate parent class instance variable.
	 public void printColor(){  
		System.out.println(color);//prints color of child  class  
		System.out.println(super.color);
}
	
	//super can be used to invoke immediate parent class method.
	 public void JavaClass() {
		 System.out.println("child class javaclass ");
	 }
	 
	 public void ChildClass() {
		 System.out.println("child class ");
	 }
	 
	 public void SuperSample() {
		 
		 super.JavaClass();
		 printColor();
	 }	 
		 
	 //super is used to invoke parent class constructor.
	 public  Child(){
      super();
       System.out.println("super is used to invoke parent class constructor.   child class");
      
		 
	 }

}