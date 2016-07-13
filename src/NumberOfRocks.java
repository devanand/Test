import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberOfRocks {
	static void gems(String a[]) {
		Map<String, Integer> m = new HashMap<>();
		for(String s:a) {
			Map<String, Integer> tMap = new HashMap<>();
			char temp[] = s.toCharArray();
			for(char x:temp) {
				String c=x+"";
				if(tMap.get(c) == null) {
					tMap.put(c, 1);
					if(m.get(c) == null) {
						m.put(c, 1);
					} else {
						m.put(c, m.get(c)+1);
					}
				}
			}
		}
		int gems=0;
		for(String element:m.keySet()) {
			if(m.get(element) == a.length) {
				gems++;
			}
		}
		
		System.out.println(gems);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int testCases = Integer.parseInt(s.nextLine());
		String a[] = new String[testCases];
		for(int i=0;i<testCases;i++) {
			a[i] = s.nextLine();
		}
		gems(a);
		s.close();
	}
}
