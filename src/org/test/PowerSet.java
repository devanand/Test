package org.test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class PowerSet {
	
	static Set <List<Integer>> powerSet = new HashSet<List<Integer>>();
	static void powerSet(List <Integer> numbers) {
		System.out.println(numbers);
		powerSet.add(numbers);
		
		for(int i=0;i<numbers.size();i++) {
			List <Integer> temp = new LinkedList<Integer>(numbers);
			temp.remove(i);
			powerSet(temp);
		}
	}
	
	public static void main(String[] args) {
		List <Integer> l = new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		powerSet(l);
		System.out.println(powerSet);
	}
}
