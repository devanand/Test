
public class MaximizingXOR {

	static int maxXor(int l, int r) {
        int x = l^r;
        int result = 1;
        while( x != 0 ) {
            result = result<<1;
            x = x>>1;
        }
        return result - 1;
    }
	
	public static void main(String[] args) {
		int l = 10, r= 12;
		System.out.println(maxXor(l, r));
	}
}
