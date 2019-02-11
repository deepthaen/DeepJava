package javaPrograms;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int val = sc.nextInt();
    String months;
    
    switch(val){
    case 1:
    	months = "Jan";
    break;
    case 2:
    	months = "Feb";
    break;
    case 3:
    	months = "March";
    break;
    case 4:
    	months = "April";
    break;
    case 5:
    	months = "May";
    break;
    case 6:
    	months = "June";
    break;
    
    
    
    default: 
        months = "Invalid day";
        break;
   }
   System.out.println(months);

}}
