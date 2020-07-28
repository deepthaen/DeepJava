package a1_new_preparation;

import java.util.Scanner;

public class AreaOfCircle {
	
	public static void main(String[] args) {
		double Area;
		
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		System.out.println("radius"  + radius);
			
	
		Area= (3.14)*(radius * radius);
	System.out.println("Area od circle" + Area);
	

}
}