import java.util.Arrays;
import java.util.LinkedList;

public class Reorder {

	static void reOrder(int a[], int index[]) {
		for(int i=0;i<a.length;i++) {
			int temp = a[index[i]];
			a[index[i]] = a[i];
			a[i] = temp;
			
			temp = index[index[i]];
			index[index[i]] = index[i];
			index[i] = temp;
		}
		System.out.println(Arrays.toString(a));
	}
	
	public static void main(String[] args) {
		int a[] = {10, 11, 12};
		int index[] = {1, 0, 2};
		reOrder(a, index);
	}
}
