package org.test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindRedundantBraces {

	public static int getPriority(String s) {
		int i = 100;
		if(s.equals("*")) {
			i = 3;
		} else if(s.equals("+")) {
			i = 2;
		}
		return i;
	}
	
	public static void main(String[] args) {
		String a = "((a*b)+c*(e + f))";
		
		String currentOperator = null;
		String temp[] = a.split("");
		List <String> expList = Arrays.asList(temp);
		List <Integer> removeList = new LinkedList<Integer>();
		for(int i = 0;i<expList.size();i++) {
			if(expList.get(i).equals("+") || expList.get(i).equals("-")||expList.get(i).equals("*")) {
				currentOperator = expList.get(i);
			}
			if(expList.get(i).equals("(")||expList.get(i).equals(")")) {
				boolean l = false, r = false;
				if((i-1)>=0) {
					if(expList.get(i-1).equals("+") || expList.get(i-1).equals("-")||expList.get(i-1).equals("*")) {
						l=true;
					}
				}
				if((i+1)<expList.size()) {
					if(expList.get(i+1).equals("+") || expList.get(i+1).equals("-")||expList.get(i+1).equals("*")) {
						r=true;
					}
				}
				
				if(i == 15) {
					System.out.println("in fifteen "+ l + " " + r);
				}
				if(!l && !r) {
					removeList.add(i);
				}
				
				if(l && !r) {
					if(getPriority(currentOperator)>getPriority(expList.get(i-1))) {
						removeList.add(i);
					}
				}
				
				if(!l && r) {
					if(getPriority(currentOperator)>getPriority(expList.get(i+1))) {
						System.out.println("In here " + i);
						removeList.add(i);
					}
				}
			}
		}
		System.out.println(currentOperator);
		System.out.println(removeList);
		System.out.println(expList);
	}

}
