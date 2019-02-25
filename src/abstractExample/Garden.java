package abstractExample;

public abstract class Garden {
	
	Garden(){
		System.out.println("constructor in abstract class");
	}
	
	abstract void PlayGround();
	
	void run() {
		System.out.println("normal class in parent abstract class");
	}

}

class plants extends Garden{
	
	plants(){
		System.out.println("construct in abstract child class");
	}

	@Override
	void PlayGround() {
		// TODO Auto-generated method stub
		System.out.println("play ground in child anstract class");
	}
	
}

