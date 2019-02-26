package hash;

import java.util.HashMap;

public class HashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer>  hm = new HashMap<String, Integer>();
		//put 
		hm.put("Deep", 22);
		hm.put("Dolly", 33);
		hm.put("Sweety", 22);
		hm.put("", 88);
		hm.put("xx",22 );
		hm.put("Dolly", 33);
		System.out.println("hash map Value ::" + hm);
		
		//print key and value
		for(String i : hm.keySet()) {
			System.out.println("Key==" + i + "==" +"==value==" + hm.get(i));
		}
		
		//get value by using key
		Integer valVal = hm.get("Sweety");
		System.out.println("Get value by using key"+valVal);
		
		//remove
		Integer remVal = hm.remove("");
		System.out.println("Remove :" + remVal);
		
		//size
		System.out.println("size" + hm.size());
		
		//
		//clear
		hm.clear();
		
		
		
		
		
		
		
		
		
		
		

	}

}
