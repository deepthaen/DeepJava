
package abstractExample;

public abstract class Bike {
	
	public Bike() {
		System.out.println("constructor in abstract class");
	}    
	
	abstract void run();
	void price() {
		System.out.println("Price of each bike");
	}

}

class Movemnt extends Bike{

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Bike is running");
	}
	
}

