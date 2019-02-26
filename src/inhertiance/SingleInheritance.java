package inhertiance;

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassB SI = new ClassB();
		SI.call();
		SI.msg();
		
		

	}

}
class classA{
	void msg() {
		System.out.println("Class A Implemntion");
	}
}

class ClassB extends classA{
	
	void call() {
		System.out.println("class B Implemention");
	}
	
}