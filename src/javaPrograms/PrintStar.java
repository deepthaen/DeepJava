package javaPrograms;

public class PrintStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1 ;i <=3 ; i++) {
			for (int j= 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		} 
		System.out.println("\n");
		
		for(int k =1; k<=3; k++) {
			for(int l = 1; l<=3; l++) {
				System.out.print("*");
			}
			System.out.println("");
		} 
		System.out.println("\n");
		
		for(int i =3 ;i >=1 ; i--) {
			for (int j= 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		} 
	}
}
