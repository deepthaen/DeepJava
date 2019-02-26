package hash;

import java.util.HashMap;

public class HaspMapO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, Integer>  ii = new HashMap<Integer, Integer>();
		ii.put(12, 15);
		ii.put(16, 34);
		ii.put(00, 89);
		ii.put(00, 89);
		
		System.out.println("Hash map Value " + ii);
		
		for(int i : ii.keySet()) {
			System.out.println("Key==" + i + "==" +"==value==" + ii.get(i));
		}
		
		HashMap<String, String> ss = new HashMap<String, String>();
		ss.put("Deep", "DD");
		ss.put("sss", "ss");
		ss.put("dff", "gg");
		
		for(String i : ss.keySet()) {
			System.out.println("Key==" + i + "==" +"==value==" + ss.get(i));
		}
		
		HashMap<String, Integer> si = new HashMap<String, Integer>();
		si.put("Deep", 333);
		si.put("tttt", 55);
		si.put("ssf", 5);
		for(String i : si.keySet()) {
			System.out.println("Key==" + i + "==" +"==value==" + si.get(i));
		}
		
		HashMap<Integer, String> is = new HashMap<Integer, String>();
		is.put(12, "Deep");
		is.put(15, "sss");
		is.put(33, "aaa");
		System.out.println(is);
		
		for(int i : is.keySet()) {
			System.out.println("Key " + i + "==="+ is.get(i));
		}
		
	}

}
