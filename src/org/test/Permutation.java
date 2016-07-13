package org.test;

public class Permutation {

	static void permutation(String prefix, String str, String original, int k) {
		
		int length = str.length();
		boolean isExist = false;
		for(int i=0;i<prefix.length();i++) {
			if(prefix.charAt(i) == original.charAt(i)) {
				isExist = true;
			}
		}
		
		if(isExist) return;
		/*
		 * If k = 2 and length is 3 this value should be length - k
		 * In this case length of the string is 3 and k = 2
		 */
		if(length == original.length()-k) {
			System.out.println(prefix);
			return;
		}
		
		for(int i=0;i<length;i++) {
			permutation(prefix+str.charAt(i), str.substring(0, i)+str.substring(i+1, length), original, k);
		}
	}
	
	public static void main(String[] args) {
		int k=3;
		permutation("", "123", "123", k);
		//System.out.println(x[0]);
		
	}
}
