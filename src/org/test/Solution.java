package org.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	
	static void swap_array(int a[]) {
		Map<Integer, List<Integer>> m = new HashMap<Integer, List<Integer>>();
		for(int x:a) {
			
		}
	}
	
	static int bitCount(int u)
	{
	     int uCount;

	     uCount = u - ((u >> 1) & 033333333333) - ((u >> 2) & 011111111111);
	     return ((uCount + (uCount >> 3)) & 030707070707) % 63;
	}
	

	public static void main(String[] args) {
		int a = 13;
		int b = a-((a>>1) & 033333333333) - ((a>>2) & 011111111111);
		System.out.println(b);
    }
	
	static void palindrome1() {
		int n = 1;
		int i = 101101;
		int previous = i;
		System.out.println(i);
		while(true) {
			
			if((i%100000)/10 == 9999) {
				i = i+11;
			}
			
			else if((i%10000)/100 == 99) {
				i = i+110;
			}
			
			else {
				i = i+1100;
			}
			
			if(i>=1000000) break;
			n++;
			if(previous != 0) {
				System.out.println("Difference "+(i-previous));
			}
			System.out.println(i);
			previous = i;
			
		}
		System.out.println("Palindromes = "+n);
	}
	
	static void palindrome() {
		int n = 0;
		int previous = 0;
		
		for(int i = 101101;i<1000000;i++) {
			if(isPalindrome(i)) { 
				n++;
				
				if(previous !=0) {
					System.out.println("difference "+(i-previous));
				}
				System.out.println(i);
				previous = i;
			}
		}
		System.out.println("Palindromes = "+n);
	}
	
	
	
	private static boolean isPalindrome(int n) {
		int first = n/1000; 
		int x =100;
		int temp = 0;
		for(int k = 0;k<3;k++) {
			temp = temp+(n%10)*x;
			n = n/10;
			x = x/10;
		}
		return first == temp;
	}
}
