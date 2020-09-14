package a1_new_preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class DuplicateCharacter_In_String {
	
	public static void main(String[] args) {
		//duplicate("aaadbfaaaabb");
		duplicateWord("Deeptha and dummy is a big dubakur and very big");
		//int[] a = {2,4,5,2,4,5,5,5,5,6,2};
		//arrayDuplicate(a);
		//duplicate_without_hasmap("aaadbfaaaabb");
	}
	
	public static void duplicate_without_hasmap(String str) {
		
		int count =0;
		for (int i = 0; i < str.length(); i++) { // aaadbfaaaabb
			count =1;
			char a = str.charAt(i);//a
			
			for (int j = i+1; j < str.length(); j++) { //abc
				char b= str.charAt(j); //a
				if(a == b) { //a==a
					count++;//6
					//str = str.substring(0, j)+str.substring(j+1); //aabc-->0,1+2
				}
			}
			if(count>1) {
				System.out.println(a);
			}
			String s = String.valueOf(a);
			str = s.replaceAll(s, "");
		}
	}
	
	public static void duplicate(String str) { // Using Hash Map
		int len = str.length();
		HashMap<Character, Integer> map = new HashMap<>(); // empty object
		for (int i = 0; i < len; i++) { //i=0,key=a -- i=1,key=a
			char key = str.charAt(i);//val=a -- val =a
			
			if(map.containsKey(key)) { // key =a
				int value = map.get(key);
				map.put(key, value+1);
			}else {
				map.put(key,1); //a=1
			}
		}
		System.out.println(map);   
		
		Set<Character> set = map.keySet();
		for(Character key: set) {
			if(map.get(key)==1) {
				System.out.println(key +" --> "+map.get(key));
			}
		} 
	}
	
	public static void duplicateWord(String str) { // Using Hash Map
		int len = str.length();
		HashMap<String, Integer> map = new HashMap<>(); // empty object
		String[] sa = str.split(" ");
		for (int i = 0; i < sa.length; i++) { //i=0,key=a -- i=1,key=a
			//char key = str.charAt(i);//val=a -- val =a
			String key = sa[i];
			if(map.containsKey(key)) { // key =a
				int value = map.get(key);
				map.put(key, value+1);
			}else {
				map.put(key,1); //a=1
			}
		}
		System.out.println(map);
		
		Set<String> set = map.keySet();
		for(String key: set) {
			if(map.get(key)>1) {    //if key >1 then takes duplicate value, if key ==1 then takes unique value
				System.out.println(key +" --> "+map.get(key));
			}
		}
		
		
	}
	
	public static void arrayDuplicate(int[] arr) {
		ArrayList<Integer> lis = SortInteger.sorting(arr);
		System.out.println(lis);
		
		//2, 2, 2, 4, 4, 5, 5, 5, 5, 5, 6
		int a = lis.get(0);
		int count =1;
		for (int j = 1; j < lis.size(); j++) {
			if(a == lis.get(j)) {
				count++;
			}else if(a!=lis.get(j)){
				System.out.println(a+"  --> "+count);
				count =1;
				a = lis.get(j);	
			}
		}
		
		//sudo
		
//		for(int i = 0; i< len ; i++) {
//			for(int j =i+1; j<len; j++) {//
//				int count=1;
//			if(arr[i] == arr[j] ) {
//				count++;
//				System.out.println(arr[j] +"  "+ count );
//				
//			}
//				
//			}
//		}
		
	}
	
	/**
	 * we need String -- aabdccf -- o/p -- ac
	 * length of String
	 * 
	 * 
	 */
	
	/**
	 * aaabadccf
	 * 012345678
	 * 
	 * if(0==1){ print =a
	 * if(0==2){ print a
	 * if(0==3){print a
	 * if(0=4){ dont print
	 * if(0==5){print a
	 * 
	 * 
	 * if(3==4){
	 */

	/**
	 * will take array
	 * length of array
	 * for loop 
	 * if
	 */
	
	
}
