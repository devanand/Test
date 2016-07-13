package org.test;

import java.lang.reflect.GenericArrayType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Testy {

//	public static void main(String[] args) {
//		int a[] = {2, 4, 1, 5, 8 ,7, 9};
//		System.out.println(a[0]);
//		int range = 1;
//		for(int i = 1;i<a.length;) {
//			range = range<<1;
//			for(int j = i;j<i+range;j++) {
//				System.out.print( a[j]+" ");
//			}
//			i =i + range -1;
//			System.out.println();
//		}
//	}
	
	public static String[] getAllCombinations(String array[][]) {
		
		
		String a[] = array[0];
		
		String temp[]=null;
		for(int i=1;i<5;i++) {
			int z=0;
			String b[] = array[i];
			temp = new String[a.length*b.length];
			for(String x:a) {
				for(String y:b) {
					temp[z] = ""+x+y;
					z++;
				}
			}
			a = temp;
		}
		System.out.println(temp.length);
		return temp;
	}
	
	private static String getPartialIssueList() {
	    String listFromProperties = "NN-09876, NN-65432, NN-65430, NN-65432";
	    StringTokenizer token = new StringTokenizer(listFromProperties, ",");
	    StringBuilder partialListString = new StringBuilder();
	    partialListString.append(" AND key=");
	    
	    while (token.hasMoreElements()) {
	    	partialListString.append(token.nextElement() + " OR key=" + token.nextElement());
	    }
	    return partialListString.toString();
	}
	
	static int gemstones(String[] rocks) {
        Map<Character, Integer> rockSet = new HashMap<Character, Integer>();
        for(char ch:rocks[0].toCharArray()) {
            if(rockSet.get(ch) == null) {
                rockSet.put(ch, 1);
            }
        }
        
        for(int i=1;i<rocks.length;i++) {
            char temp[]=rocks[i].toCharArray();
            Set<Character> checkSet = new HashSet<Character>();
            for(char ch:temp) {
            	if(checkSet.contains(ch)) {
            		continue;
            	} else {
            		checkSet.add(ch);
            	}
            	if(rockSet.get(ch) != null && rockSet.get(ch)<(i+1)) {
            		rockSet.put(ch,rockSet.get(ch)+1);
            	}
            }
        }
        int x=0;
        for(char key:rockSet.keySet()) {
        	if(rockSet.get(key) == rocks.length) {
        		x++;
        	}
        }
        System.out.println(rockSet);
        return x;

    }
	
	static int numberOfPairs(int[] a, long k) {
		Map<Integer, Integer> output = new HashMap<Integer, Integer>();
		int x=0;
	    for(int i=0;i<a.length;i++){

	        if(output.containsKey(a[i])) {
	        	x++;
	        }
	        else {
	            output.put((int)(k-a[i]), a[i]);
	        }
	    }
	    return x;

    }
	public static void main(String[] args) {
		int s[] = {6, 6, 3, 9, 3, 5, 1};
		System.out.println(numberOfPairs(s, 12));
	}
}
