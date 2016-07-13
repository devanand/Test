package org.test;

import java.awt.Color;
import java.util.concurrent.atomic.AtomicInteger;

public class CounterPoint extends Point {

	private static final AtomicInteger counter = new AtomicInteger();
	
	public CounterPoint(int x, int y) {
		super(x, y);
		counter.incrementAndGet();
	}
	
	public int numberCreated() {
		return counter.get();
	}
	
	public static void main(String[] args) {
		ColorPoint c = new  ColorPoint(1,0, Color.BLUE);
		Point p = new Point(1, 0);
		ColorPoint c2 = new ColorPoint(1, 0, Color.BLUE);
		System.out.println(c.equals(p));
		System.out.println(p.equals(c2));
		System.out.println(c.equals(c2));
	}
}
