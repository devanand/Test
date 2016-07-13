package org.test;

public class FindOddElement {

	
	static int a[]={1, 2, 2, 3, 3};
	static int length = a.length-1;
	static void findLonelyElement(int low, int high) {
		if(low>high) return;
		
		if(low==high) {
			System.out.println(a[low]);
			return;
		}
		
		int mid = low+((high-low)/2);
		if(mid%2 == 0) {
			if(a[mid] == a[mid+1]) {
				findLonelyElement(mid+2, high);
			} else {
				findLonelyElement(low, mid);
			}
		}
		
		else {
			if(a[mid-1] == a[mid]) {
				findLonelyElement(mid+1, high);
			}
			else {
				findLonelyElement(low,  mid-1);
			}
		}
	}
	
	public static void main(String[] args) {
		findLonelyElement(0, length);
	}
	
}
