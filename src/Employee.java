import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

import javax.xml.bind.annotation.adapters.HexBinaryAdapter;

public class Employee {

	int id;
	
	public void setId(int id) {
		this.id = id;
	}
	 
	public int getId() {
		return id;
	}
	
	@Override
	public int hashCode() {
		
		return 1;
	}
	
	@Override
	public String toString() {
		
		return 1+"";
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee)obj;
		return this.id == e.id;
	}
	
	public static void main(String[] args) {
		
		int a=14;
		int n=1;
		while(n<a) {
			n <<= 1;
		}
		
		System.out.println(n);
	}
}
