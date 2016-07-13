package org.test;

import java.util.Scanner;

public class Parenthesis {

	static void paranthesis(String s) {
		char a[]=s.toCharArray();
		int left=0;
		for(char x:a) {
			if(x == '{') {
				left++;
			} else if(x == '}') {
				left--;
			}
		}
		if(left>0 || left <0) {
			System.out.println("TRY AGAIN");
		} else {
			System.out.println("WELL DONE");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		paranthesis(s.nextLine());
	}
}
