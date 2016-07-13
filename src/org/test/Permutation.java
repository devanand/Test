package org.test;

public class Permutation {

	static void permutation(String prefix, String str, String original) {
		
		int length = str.length();
		boolean isExist = false;
		for(int i=0;i<prefix.length();i++) {
			if(prefix.charAt(i) == original.charAt(i)) {
				isExist = true;
			}
		}
		
		if(isExist) return;
		if(length == 0) {
			System.out.println(prefix);
			return;
		}
		
		for(int i=0;i<length;i++) {
			permutation(prefix+str.charAt(i), str.substring(0, i)+str.substring(i+1, length), original);
		}
	}
	
	public static void main(String[] args) {
		int x[] = {0};
		permutation("", "123", "123");
		//System.out.println(x[0]);
		
	}
}
