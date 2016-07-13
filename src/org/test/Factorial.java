package org.test;

public class Factorial {

	public void factorial(int n) {
		long mod = 1000000007;
		long a[] = new long[n];
		a[0] = 1l; 
		a[1] = 1l;
		
		for(int i=2;i<=n;i++) {
			a[i] = a[i-1]*i%mod;
		}
		
		System.out.println(a);
	}
}
