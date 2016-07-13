import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Anagram {
	static void anagram(String s1, String s2) {
		Map <String, Integer> m1 = new HashMap<>();
		Map <String, Integer> m2 = new HashMap<>();
		int toBeDeleted = 0;
		for(char c1:s1.toCharArray()) {
			String temp = c1+"";
			if(m1.get(temp) == null) {
				m1.put(temp, 1);
			} else {
				m1.put(temp, m1.get(temp)+1);
			}
		}
		
		for(char c2:s2.toCharArray()) {
			String temp = c2+"";
			if(m1.get(temp) == null) {
				toBeDeleted++;
			} else  {
				if(m2.get(temp) == null) {
					m2.put(temp, 1);
				} else {
					m2.put(temp, m2.get(temp)+1);
				}
			}
		}
		
		for(String key:m1.keySet()) {
			if(m2.get(key) == null) {
				toBeDeleted += m1.get(key);
			} else {
				int m1Count = m1.get(key);
				int m2Count = m2.get(key);
				toBeDeleted += Math.abs(m1Count-m2Count);
			}
			
		}
		System.out.println(toBeDeleted);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		String s2 = s.nextLine();
		anagram(s1, s2);
		s.close();
	}
}
