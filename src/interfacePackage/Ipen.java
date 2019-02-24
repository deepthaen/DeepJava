package interfacePackage;

public interface Ipen {
	
	public void ink();
	public void cap();
	
	class work{
		public static void workasPen() {
		System.out.println("class inside interface");	
		}
	}

}
class write implements Ipen{

	@Override
	public void ink() {
		// TODO Auto-generated method stub
		System.out.println("write with ink");
	}

	@Override
	public void cap() {
		// TODO Auto-generated method stub
		System.out.println("close cap of pen after write");
		
	}
	
}

class design implements Ipen{

	@Override
	public void ink() {
		// TODO Auto-generated method stub
		System.out.println("write with ink design");
	}

	@Override
	public void cap() {
		// TODO Auto-generated method stub
		System.out.println("cap  design");
	}
	
	
	
	
}
