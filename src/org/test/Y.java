package org.test;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Y implements X {

	void test(X x)
	{
		System.out.println("Y.test()");
	}
	void test1(Y y){
		Method m[] = this.getClass().getMethods();
		System.out.println(Arrays.toString(m));
	}
	
	public static void main(String[] args) {
		new Y().test1(null);
	}
}
