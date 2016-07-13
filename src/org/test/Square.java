package org.test;

public class Square {
	static int square(int n) {
		if (n <= 0) return 0;
		int carry = 1;
		int result = 0;
		while(n>0) {
			int x = n%2;
			result = result+carry*x;
			n/=2;
			carry *= 10;
		}
		
		return result;
	}
	
	static void binary(int n, String result) {
		if(n>0) {
			binary(n/2, result);
			result+=n%2;
		}
		System.out.print(result);
	}
	
	public static void main(String[] args) {
		String result="";
		binary(9, result);
		System.out.println(result);
	}
}
