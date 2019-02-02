package javaPrograms;

public class ParamtericConstructorTwo {
	int value;
	String name;
	
	
	
	public ParamtericConstructorTwo(int var, String brand) {
		value = var;
		name = brand;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParamtericConstructorTwo PCT = new ParamtericConstructorTwo(20, "Java");
		
		System.out.println(PCT.value  +   "   "  + PCT.name);

	}

}
