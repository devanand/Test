package org.test;

import java.awt.Color;
import java.util.HashMap;
import java.util.HashSet;

public class ColorPoint  {
	Color color;
	private Point P;
	public ColorPoint(int x, int y, Color color) {
		P=new Point(x, y);
		this.color = color;
	}
	
	public boolean equals(Object o) {
		if(!(o instanceof ColorPoint)) {
			System.out.println("In here");
			return false;
		}
		ColorPoint temp = (ColorPoint)o; 
		new HashMap<String, String>().put("a", "b");
		return P.equals(temp.getP()) && this.color.equals(((ColorPoint)o).color);
	}
	
	public Point getP() {
		return P;
	}
	public static void main(String[] args) {
		Point p = new Point(1, 2);
		ColorPoint c = new ColorPoint(1, 2, Color.RED);
		System.out.println(c.equals(p));
	}
}
