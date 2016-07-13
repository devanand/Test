package org.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Sorting {

	static int numbers[]={4, 3, 2, 1};
	int count = 0;
	
	public void simpleSort() {
		int length = numbers.length;
		
		for(int i=0;i<length-1;i++) {
			count++;
			
			for(int j=i+1;j<length;j++) {
				
				if(numbers[i]>numbers[j]) {
					exchange(i, j);
				}
				
				count++;
			}
		}
		System.out.println("Sorted array");
		System.out.println(Arrays.toString(numbers));
		System.out.println(count);
	}
	
	
	public void quicksort(int low, int high) {
	    int i = low, j = high;
	    int pivot = numbers[low + (high-low)/2];

	    while (i <= j) {
	    	count++;
	    	while (numbers[i] < pivot) {
	    		count++;
	    		i++;
	    	}
	    	
	    	while (numbers[j] > pivot) {
	    		count++;
	    		j--;
	    	}

	    	if (i <= j) {
	    		exchange(i, j);
	    		i++;
	    		j--;
	    	}
	    }
	    
	    if (low < j) {
	    	quicksort(low, j);
	    }
	    
	    if (i < high) {
	    	quicksort(i, high);
	    }
	    
	    System.out.println("Quick Sorted array");
		System.out.println(Arrays.toString(numbers));
		System.out.println(count);
	}

	private void exchange(int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}

	public static void main(String[] args) {
		//new Sorting().quicksort(0, numbers.length-1);;
		
		Set<String> s = new HashSet<String>();
		s.add("hi");
		s.add("bye");
		s.add("gn");
		s.add("adam");
		System.out.println(s.toString());
	}
}
