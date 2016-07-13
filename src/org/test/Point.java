package org.test;

public class Point {
	int x;
	int y;
	
	public Point(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Object o) {
		if(!(o instanceof Point)) {
			return false;
		}
		Point p = (Point)o;
		return this.x == p.x && this.y == p.y;
	}
}
