
 interface Ipark {

	public  void ground();
	public void plants();
}


class smallPark implements  Ipark{

	@Override
	public void ground() {
		System.out.println("childs Play");
		
	}

	@Override
	public void plants() {
		// TODO Auto-generated method stub
		System.out.println("plant diff trees");
	}
	
}

class bigPark implements Ipark{

	@Override
	public void ground() {
		// TODO Auto-generated method stub
		System.out.println("Big park ground");
		
	}

	@Override
	public void plants() {
		// TODO Auto-generated method stub
		System.out.println("big park plants");
	}
	
}

