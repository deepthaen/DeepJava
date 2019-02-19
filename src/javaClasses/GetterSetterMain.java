package javaClasses;

public class GetterSetterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         GetterSetterOne GSO = new GetterSetterOne();
         GSO.setname("Deep");
         System.out.println("name ::" + GSO.getname());
         
         GSO.setage(10);
         System.out.println("age ::" + GSO.getage()); 
         
		GetterSetterTwo GST = new GetterSetterTwo();
         GST.setcity("Bangalore");
         System.out.println("city ::" + GST.getcity());
         
         GST.setRollNo(344);
         System.out.println("RollNO ::" + GST.getRollNo());  
         
         GetterSetterThree GSTH = new GetterSetterThree();
         GSTH.setPlace("Mysore");
         System.out.println("Place ::"+GSTH.getPlace());
         GSTH.setpincode(560001);
         System.out.println("pincode ::"+GSTH.getpincode());
         
         
        	 
	}

}
