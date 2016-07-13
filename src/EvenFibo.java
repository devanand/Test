import java.math.BigInteger;
import java.util.Scanner;


public class EvenFibo {

	
	
	static void evenFibo(BigInteger n) {
		BigInteger f1 = BigInteger.valueOf(1);
		BigInteger f2 = BigInteger.valueOf(1);
		BigInteger f3 = f1.add(f2);
		BigInteger temp = f3;
		while(true) {
			f1 = f2.add(f3);
			 if(f1.compareTo(n) >= 0) {
				 break;
			 }
			 
			 f2 = f3.add(f1);
			 if(f2.compareTo(n) >= 0) {
				 break;
			 }
			 
			 f3 = f1.add(f2);
			 if(f3.compareTo(n) >= 0) {
				 break;
			 }
			 temp = temp.add(f3);
		}
		System.out.println(temp);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int testCases = Integer.parseInt(s.nextLine());
		for(int i = 0;i<testCases;i++) {
			BigInteger number = BigInteger.valueOf(Long.parseLong(s.nextLine()));
			evenFibo(number);
		}	
	}
}
