import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramByChanging {

	static void anagram(String s1, String s2) {
		Map <String, Integer> m1 = new HashMap<>();
		Map <String, Integer> m2 = new HashMap<>();
		int toBeChanged = s1.length();
		
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
			if(m2.get(temp) == null) {
				m2.put(temp, 1);
			} else {
				m2.put(temp, m2.get(temp)+1);
			}

		}
		
		for(String key:m2.keySet()) {
			if(m1.get(key) != null) {
				int m1Count = m1.get(key);
				int m2Count = m2.get(key);
				if(m1Count == m2Count) {
					toBeChanged -=m1Count;
				} else {
					toBeChanged -= (m1Count<m2Count?m1Count:m2Count);
				}
			} 
		}
		System.out.println(toBeChanged);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int testCases = Integer.parseInt(s.nextLine());
		for(int i=0;i<testCases;i++) {
			String temp = s.nextLine();
			if((temp.length()&1 )!= 0) {
				System.out.println(-1);
				continue;
			}
			anagram(temp.substring(0, temp.length()/2), temp.substring(temp.length()/2, temp.length()));
		}
		s.close();
	}
}
