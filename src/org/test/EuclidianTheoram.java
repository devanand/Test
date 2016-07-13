package org.test;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class EuclidianTheoram {

	public static int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b, a%b);
	}
	
 	static void euclid(int a[], int m) {
 		TreeSet<Integer> t = new TreeSet<Integer>();
 		int gcd = gcd(a[0], a[1]);
 		for(int i=2;i<a.length;i++) {
 			gcd = gcd(gcd, a[i]);
 		}
 		int max = a[a.length-1];
 		
 		int k = 1;
 		while((k*gcd)<=max) {
 			t.add(k*gcd);
 			k++;
 		}
 		Integer x[]=new Integer[t.size()]; 
 		t.toArray(x);
 		System.out.println(x[x.length-m]);
 		
 	}
 	
 	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = Integer.parseInt(s.nextLine());
		String temp[] = s.nextLine().split(" ");
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = Integer.parseInt(temp[i]);
		}
		Arrays.sort(arr);
		int element = Integer.parseInt(s.nextLine());
		euclid(arr, element);
		s.close();
	}
}
