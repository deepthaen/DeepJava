package javaPrograms;

public class GetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GetSet GS = new GetSet();
		GS.setUserName("Deep");
		
		System.out.println("Setter Getter Name :: " +GS.getUserName());
		
		GS.setPassword("ererer");
		System.out.println("Setter Getter Passwors :: " + GS.getPassword());
		
		GS.setRollNo(12);
		System.out.println("Setter Getter RollNo :: " + GS.getRollNo());
	}
	}


