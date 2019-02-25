package interfacePackage;

import interfacePackage.NestedInterface.Ininterface;

public interface NestedInterface {

	void room();

	interface Ininterface {
		void dance();
	}

}
class stage implements NestedInterface {

	@Override
	public void room() {
		// TODO Auto-generated method stub
	}
}

class Preforamnce implements Ininterface{

	@Override
	public void dance() {
		// TODO Auto-generated method stub
	
	}
}
	
class Event implements Ininterface, NestedInterface{

	@Override
	public void room() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		
	}
	
}
	
