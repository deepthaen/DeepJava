package interfacePackage;

public interface Iplayer {
	
	public void Move();
	public void play();

}

class Hockey implements Iplayer{

	@Override
	public void Move() {
		System.out.println("Take ball and move in hockey");
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Take ball and play in hockey");
	}
	
}

class cricket implements Iplayer{

	@Override
	public void Move() {
		// TODO Auto-generated method stub
		System.out.println("Take ball and move in cricket");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Take ball and play in cricket");
	}
	
}