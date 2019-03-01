package javaPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DuplicateStringHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<Integer, Integer> el = new HashMap<Integer, Integer>();
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		el.put(22, 33);
		el.put(55, 33);
		el.put(21, 53);
		el.put(02, 22);
		el.put(22, 33);
		el.put(22, 33);
		
		System.out.println("Map Value ::"  + el);
		
		for(Map.Entry<Integer, Integer> e : el.entrySet()){
			System.out.println("Key ::" + e.getKey()+ "Value ::" + e.getValue());
			
			if(a.contains(e.getValue())) {
				System.out.println("dupicate" + e.getValue());
				
			}else {
				a.add(e.getValue());
			}
		
	}

}}
