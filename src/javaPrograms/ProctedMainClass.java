package javaPrograms;

import javaClasses.ProctdClass;

public class ProctedMainClass extends ProctdClass{

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ProctedMainClass PC = new ProctedMainClass();
		
		ProctedMainClass PCo = new ProctedMainClass();
		PC.display();
		
		System.out.println("Name ::"  + PC.name);
		
		System.out.println("age ::"  + PCo.age);
		
		PCo.show();
	}

}
