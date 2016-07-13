package org.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AbsoluteMinimum {
	static void quicksort(int low, int high, int numbers[], int min[], int abs[]) {
	    int i = low, j = high;
	    int pivot = numbers[low + (high-low)/2];

	    while (i <= j) {
	    	while (numbers[i] < pivot) {
	    		i++;
	    	}
	    	
	    	while (numbers[j] > pivot) {
	    		j--;
	    	}

	    	if (i <= j) {
	    		exchange(i, j, numbers);if(i+1<numbers.length) {
	    			
                	abs[i] = Math.abs(numbers[i]-numbers[i+1]);
                	if(abs[i]<min[0]) {
                		min[0] = abs[i];
                	}
                } 
                
                if(i-1>=0) {
                	abs[i-1] = Math.abs(numbers[i]-numbers[i-1]);
                	if(abs[i-1]<min[0]) {
                		min[0] = abs[i-1];
                	}
                }
                
	    		i++;
	    		j--;
	    	} else {
	    		if(i+1<numbers.length) {
                	abs[i] = Math.abs(numbers[i]-numbers[i+1]);
                	if(abs[i]<min[0]) {
                		min[0] = abs[i];
                	}
                } 
                
                if(i-1>=0) {
                	abs[i-1] = Math.abs(numbers[i]-numbers[i-1]);
                	if(abs[i-1]<min[0]) {
                		min[0] = abs[i-1];
                	}
                }
	    	}
	    }
	    
	    if (low < j) {
	    	quicksort(low, j, numbers, min, abs);
	    }
	    
	    if (i < high) {
	    	quicksort(i, high, numbers, min, abs);
	    }
	    
	}

	static void exchange(int i, int j, int numbers[]) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size=Integer.parseInt(s.nextLine());
		int numbers[] = new int[size];
		String numberString[] = s.nextLine().split(" ");
		for(int i=0;i<numberString.length;i++) {
			numbers[i] = Integer.parseInt(numberString[i]);
		}
		int abs[]= new int[numbers.length-1];
		int min[] = new int[1];
		min[0] = Integer.MAX_VALUE;
		quicksort(0, numbers.length-1, numbers, min, abs);
		for(int i=0;i<abs.length;i++) {
			if(abs[i] == min[0]) {
				System.out.print(numbers[i]+" "+numbers[i+1]+" ");
			}
		}
	}
}

