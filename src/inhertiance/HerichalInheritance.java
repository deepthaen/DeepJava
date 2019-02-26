package inhertiance;

public class HerichalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassH HI = new ClassH();
		HI.school();
		HI.sports();
		
		
	}

}

class ClassF {
	void school() {
		System.out.println("Class F Implemented");
	}
}
class ClassG extends ClassF{
	void playGround() {
		System.out.println("Class G is implemeted");
	}
}

class ClassH extends ClassF{
	void sports() {
		System.out.println("Class H is implemted");
	}
}