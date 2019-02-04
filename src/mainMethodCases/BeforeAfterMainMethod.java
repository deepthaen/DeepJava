package mainMethodCases;

public class BeforeAfterMainMethod {
	
	
	public static void main(String[] args) {
		System.out.println("Running Current main");
	}

	
	static {
		System.out.println("Before MAIN");
	}

}
