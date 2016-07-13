package org.test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;


public class StringCompare {
	
	public static int maxSubArray(final List<Integer> a) {
		int current_sum=0, max_sum=Integer.MIN_VALUE;
	    for(int i = 0;i<a.size();i++) {
	    	int temp = a.get(i);
	    	current_sum = current_sum +temp;
			
			if(temp > current_sum) {
				current_sum = temp;
			}

			if(current_sum>max_sum) {
				max_sum = current_sum;
			}
	    }
	    
	    return max_sum;
	}
	
	public static List<Integer> plusOne(List<Integer> a) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int carry = 1;
		for(int i=a.size()-1;i>=0;i--) {
			int x = a.get(i)+carry;
			if(x>=10) {
				result.add(0, 0);
				if(i == 0) {
					result.add(0,1);
				} 
			} else {
				
				if(carry == 1) {
					result.add(0, x);
				} else {
					boolean isAdd = false;
					if(a.get(i) == 0) {
						for(int k=i-1;k>=0;k--) {
							if(a.get(k)>0) {
								isAdd = true;
								break;
							}
						}
						if(isAdd)
							result.add(0, a.get(i));
					} else {
						result.add(0, a.get(i));
					}
					
				}
				carry = 0;
			}
		}
		return result;
	}
	
	
	static void distance(List <Integer>X, List <Integer> Y) {
		int distance = 0;
        for(int i=0;i<X.size()-1;i++) {
            int x1 = X.get(i);
            int y1 = Y.get(i);
            int x2 = X.get(i+1);
            int y2 = Y.get(i+1);
            
            distance += Math.max(Math.abs(x2-x1), Math.abs(y2-y1));
            
        } 
        System.out.println(distance);
	}
	
	static void swap1(List <Integer>a) {
		BigInteger l = BigInteger.valueOf(a.size());
		BigInteger sum = l.multiply(l.add(BigInteger.ONE)).divide(BigInteger.valueOf(2));
		
		BigInteger sumSquares = sum.multiply(l.multiply(BigInteger.valueOf(2).add(BigInteger.ONE))).divide(BigInteger.valueOf(3));
		
		BigInteger actualSum = BigInteger.ZERO;
		BigInteger actualSquareSum = BigInteger.ZERO;
		
		for(int x:a) {
			actualSum = actualSum.add(BigInteger.valueOf(x));
			actualSquareSum = actualSquareSum.add(BigInteger.valueOf(x).multiply(BigInteger.valueOf(x)));
		}
		
		BigInteger differenceSquare = sumSquares.subtract(actualSquareSum);
		BigInteger differenceSum = sum.subtract(actualSum);
		
	}
	
	static void swap(List<Integer> a) {
		long l = a.size();
		long sum = l*(l+1)/2;
		
		long sumSquares = sum*((2*l)+1)/3;
		long actualSum = 0, actualSquareSum = 0;
		for(int x:a) {
			actualSum +=x;
			actualSquareSum += (x*x);
		}
		
		long differenceSquare = sumSquares - actualSquareSum;
		long differenceSum = sum-actualSum;
		
		long sumOfMissing = differenceSquare/differenceSum;
		
		int missing = (int)(sumOfMissing+differenceSum)/2;
		int replace = (int)(sumOfMissing-missing);
		
		List <Integer> result = new LinkedList<>();
		result.add(replace);
		result.add(missing);
		
	}
	
	static String reverseWord(String s, int index) {
		String s1[] = s.split(" ");
		if(index>=s1.length || index<0) {
			return s;
		}
		int x=0;
		StringBuffer result = new StringBuffer();
		for(int i=0;i<index;i++) {
			result.append(s1[i]+" ");
			x++;
		}
        char[] c = s1[index].toCharArray();
        
        for(int i=c.length-1;i>=0;i--) {
        	 if(i == 0) {
                 result.append(c[i]+" ");
             } else {
                 result.append(c[i]);                
             }
        }
        x++;
        
        if(x < s1.length-1)
        for(;x<=s1.length-1;x++) {
        	if(x==s1.length-1) {
        		result.append(s1[x]);
        	} else {
        		result.append(s1[x]+" ");
        	}
        	
        }
        return result.toString();
    }
	
	static int findFirstCapitalLetter(String s) {
        char[] s1 = s.toCharArray();
        
        for(int i=0;i<s1.length;i++) {
        	int val = s1[i];
        	if(val>=65 && val<=90) {
        		return i;
        	}
        }
        return -1;
    }
	
	static void maxCount(String s1, String s2) {
		TreeMap <Character, Integer> t1 = new TreeMap<>();
		TreeMap <Character, Integer> t2 = new TreeMap<>();
		int max = 0;
		for(char c:s1.toCharArray()) {
			if(t1.get(c) == null) {
				t1.put(c, 1);
			} else {
				t1.put(c, t1.get(c)+1);
				if(max<t1.get(c)) {
					max = t1.get(c);
				}
			}
		}
	}
	
	static void stringReduction(String s) {
		int n = s.length()-1;
		char c[]=s.toCharArray();
		for(int i=1;i<=n;n++) {
			
		}
	}
	
	public static void main(String args[] ) throws Exception {
	     String s = "07:05:45PM";
		System.out.println(s.substring(s.length()-2));
    }
}