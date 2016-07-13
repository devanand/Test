package org.test;

public class Pascal {

	private static void pascal(int maxRows) {
		int num = 1;
		for(int i=0;i<maxRows;i++) {
			for(int j=i;j<maxRows-i;j++) {
				System.out.print(" ");
			}
			
			for(int k=0;k<(2*i+1);k++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		pascal(3);
	}
}
