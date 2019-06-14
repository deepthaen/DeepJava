package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class Collection {

	public static void main(String[] args) {
		HashMap<Integer ,Integer> h = new HashMap<Integer, Integer>();
		h.put(20, 32);
		h.put(20, 38);
		h.put(20, 40);
		h.put(24, 31);
		h.put(23, 36);
		h.put(21, 42);
		for(Entry<Integer, Integer> i : h.entrySet()) {
			System.out.println(i.getKey()+ " "+ i.getValue());
		
			if((i.getKey()%2) == 0) {
			//	System.out.println(i.getKey());
			}
		}
		
		HashSet<Integer> s =new HashSet<Integer>();
		s.add(1);s.add(1);s.add(1);s.add(1);s.add(1);s.add(1);
		
		for(Integer i:s) {
			System.out.println(i);
		}
		
		
		
		
	}

}
