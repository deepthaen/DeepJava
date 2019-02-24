package interfacePackage;

public interface Ivechicle {
	
	public void ChangeGear(int a);
	public void Speed(int b);
	public void Brake(int c);
	
	}

class vechileOne implements Ivechicle{
   
	int gear;
	int dec, ince;
	
	@Override
	public void ChangeGear(int a) {
		// TODO Auto-generated method stub
		gear = a;
	}

	@Override
	public void Speed(int b) {
		// TODO Auto-generated method stub
		dec = dec + b;
		System.out.println(dec);
	}

	@Override
	public void Brake(int c) {
		// TODO Auto-generated method stub
		ince = ince + c;
		System.out.println(ince);
	}
	
}

class vechicleTwo implements Ivechicle{

	int gear;
	int dec, ince;
	
	@Override
	public void ChangeGear(int a) {
		// TODO Auto-generated method stub
		gear = a;
	}

	@Override
	public void Speed(int b) {
		// TODO Auto-generated method stub
		dec = dec + b;
		System.out.println(dec);
	}

	@Override
	public void Brake(int c) {
		// TODO Auto-generated method stub
		ince = ince + c;
		System.out.println(ince);
	}
	
}