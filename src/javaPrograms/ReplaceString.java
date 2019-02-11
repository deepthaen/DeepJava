package javaPrograms;

import java.util.Scanner;

public class ReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter String ::  ");
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        //replace
        String StrRep = str.replace("d", "##");
        System.out.println(StrRep);
        
        //replace by regular expression
        String Str1 = str.replaceAll("[0-9]", "&");
        System.out.println(Str1);
        
        //replace by index
        str = str.substring(0,5)+'x'+str.substring(6); 
        System.out.println(str);
		}

}
