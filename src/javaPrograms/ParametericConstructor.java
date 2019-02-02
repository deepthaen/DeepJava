package javaPrograms;

public class ParametericConstructor {
	int var;
	
	
	public ParametericConstructor(int val) {
		var = val;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParametericConstructor PC = new ParametericConstructor(55);
		
          System.out.println(PC.var);
	}

}
