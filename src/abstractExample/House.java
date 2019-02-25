package abstractExample;

public abstract class House {
	
	House(){
		System.out.println("constructor in parent abstract");
				}
	abstract void doors();
	public abstract void windows(String a);
	void rooms() {
		System.out.println("all rooms in house");
	}

}

class smallhouse extends House{

	@Override
	void doors() {
		// TODO Auto-generated method stub
		System.out.println("Doors in small house");
	}

	@Override
	public void  windows (String b) {
		// TODO Auto-generated method stub
		System.out.println("Windows in small house");
		System.out.println(b);
		
	
	}
	
}