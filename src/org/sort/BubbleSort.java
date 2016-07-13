package org.sort;

import java.util.Arrays;

public class BubbleSort {

	static void bubbleSort(int a[]) {
		for(int i=a.length -1 ;i>=0;i--) {
			for(int j=0;j<i;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
	}
	
	public static void main(String[] args) {
		int a[] = {5, 4, 1, 3};
 		bubbleSort(a);
	}
}