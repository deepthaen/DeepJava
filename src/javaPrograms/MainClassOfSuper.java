package javaPrograms;

public class MainClassOfSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//super can be used to refer immediate parent class instance variable.
		Child c = new Child();
		c.printColor();
		
		//super can be used to invoke immediate parent class method.
		c.SuperSample();
		
		//super() can be used to invoke immediate parent class constructor.
		// this executed 
	}

}
