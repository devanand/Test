
public class SwapInOneLine {

	public static void swapInOneLine(int a, int b) {
		a = a^b^(b=a);
		System.out.println(a+"  "+b);
	}
	
	public static void main(String[] args) {
		swapInOneLine(-1, 2);
	}
}
