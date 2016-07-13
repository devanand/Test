
public class Cuboid {

	static void findMaxSpace(int n) {
		 if(n%2 == 0) {
	            int l = n/2-1;
	            int w = n/2-1;
	            int h = n-l-w;
	            System.out.println(l*w*h);
	        } else {
	            int l = n/2;
	            int w = n/2;
	            int h = n-l-w;
	            System.out.println(l*w*h);
	        }
	}
	
	public static void main(String[] args) {
		findMaxSpace(83);
	}
}
