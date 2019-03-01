package javaPrograms;

public class UpcastNDownCasting {
	public static void main(String[] args) {
		
		//UpCasting
		rat r = new rat();
		upcastdownCasting  updo = (upcastdownCasting)r;
		updo.eat();
		
	//	upcastdownCasting  udc = new Cat();
	//	Cat c = (Cat) udc;
		
	}

}

class upcastdownCasting{
public void eat() {
	System.out.println("parent class eating ......");
}

public void drink() {
	System.out.println("Parent class Drink ........");
}
}

class rat extends upcastdownCasting{
	public void eat() {
		System.out.println("Child class eating ......");	
	}
	
	public void drink() {
		System.out.println("child class Drink ........");
	}
	
	public void walk() {
		System.out.println("child class walk ........");
		
	}
 
class Cat extends upcastdownCasting{
	public void talk() {
		System.out.println("cat is ");
	}
}
}
