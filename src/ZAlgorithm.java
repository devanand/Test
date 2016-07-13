import java.util.Arrays;

public class ZAlgorithm {

	static void zAlgo(char a[]) {
		int left = 0, right = 0;
		int result[] = new int[a.length];
		int max = 0, total = 0;
		for(int i=1;i<a.length;i++) {
			
			if(i>right) {
				left = right = i;
				while(right<a.length && a[right] == a[right-left]) {
					right++;
				}
				result[i] = right-left;
				right--;
			} else {
				int k = i-left;
				if(result[k] < right - i+1) {
					result[i] = result[k];
				} else {
					left = i;
					while(right<a.length && a[right] == a[right-left]) {
						right++;
					}
					result[i] = right-left;
					right--;
				}
			}
			if(result[i]>max) {
				max = result[i];
				total = max;
			} else if(result[i] == max) {
				total = total+max;
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(result));
		System.out.println(total);
	}
	
	public static void main(String[] args) {
		zAlgo(new String("aba$abab").toCharArray());
	}
}
