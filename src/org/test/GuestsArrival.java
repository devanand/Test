package org.test;

import java.util.Arrays;

public class GuestsArrival {

	static void quickSort(int array[], int i, int j) {
		int low = i, high = j;
		int mid = i+((j-i)/2);
		while(low <= high) {
			while(array[low]<array[mid]) {
				low++;
			}
			
			while(array[high]>array[mid]) {
				high--;
			}
			
			if(low<=high) {
				int temp = array[low];
				array[low] = array[high];
				array[high] = temp;
				low++;
				high--;
			}
			
			
			if(i<high) {
				quickSort(array, i, high);
			}
			
			if(low<j) {
				quickSort(array, low, j);
			}
		}
	}
	
	static void mostPeople(int arrival[], int departure[]) {
		int i = 1, j = 0;
		int n = arrival.length, m = departure.length;
		
		int arrMax = 1; 
		int guestsIn = 1;
		int time = arrival[i];
		while(i<n && j<m) {
			
			if(arrival[i]<=departure[j])
			{
				guestsIn++;
				if(guestsIn>arrMax) {
					arrMax = guestsIn;
					time = arrival[i];
				}
				
				i++;
				
			} else {
				guestsIn--;
				j++;
			}
			
		}
		
		System.out.println("Maximum number of  guests at "+time+" is "+arrMax);
	}
	
	public static void main(String[] args) {
		int arrival[] = {1, 2, 10, 5, 5};
		int departure[] = {4, 5, 12, 9, 12};
		quickSort(arrival, 0, arrival.length-1);
		quickSort(departure, 0, departure.length-1);
		System.out.println(3&1);
		mostPeople(arrival, departure);
	}
}
