package javaPrograms;

public class SuperClass {
	//super can be used to refer immediate parent class instance variable.
	String color = "black";
	
	//super can be used to invoke immediate parent class method.
	public void JavaClass() {
		System.out.println("super class java class");
	}
	
	 //super is used to invoke parent class constructor.
	public  SuperClass() {
		System.out.println("super class constructor call");
		
	}
	
	}
