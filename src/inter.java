import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class inter {
	public static void main(String[] args) {
		String a = "Get Badddde";
		String s = "Water Heater";
		String v = match(a);
			System.out.println(v);
	}

	public static String match(String s) {
		String a="";
		String[] sa= s.split(" ");
		String s1 = sa[0];
		String s2 = sa[1];
		
			boolean flag =true;

			int i =0;
			int j=0;
			int l = s1.length();
			int l2 = s2.length();
			int count=0;
			while(flag) {
				char c = 0;
				char c2 = 0;
				if(i>=l) {

				}else {
					c= s1.charAt(l-1);
				}
				if(j>=l2) {

				}else {
					c2= s2.charAt(l2-1);
				}
				if(c != c2) {
					flag = false;
				}else {
					count++;
					
				}
				l--;
				l2--;
			}
			
		if(count>=1) {
			a="Mathces";
		}else {
			a="Not macthes";
		}

		return a;
	}

	private static void repeat(String a) {
		String[] e =a.split(" "); 
		int len = e.length;

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		//HashSet<Character> map = new HashSet<>();

		for (int i = 0; i < len; i++) {



			char c = a.charAt(i);
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		//System.out.println(map);


		Set<Character> set = map.keySet();
		for (char f : set) {
			if(map.get(f) > 1) {
				System.out.println(f + " "+ " No unique Character is present");

			}
			else {
				System.out.println(" Duplicate character");
			}

		}

	}
}















