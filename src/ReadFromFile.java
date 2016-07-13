import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFromFile {

	public static void main(String[] args) throws Exception {
		System.out.println(ReadFromFile.class.getResource("map.txt").getFile());
		File f = new File(ReadFromFile.class.getResource("map.txt").getFile());
		FileReader f1 = new FileReader(f);
		BufferedReader b = new BufferedReader(f1);
		int i=0;
		while(i<=1) {
			System.out.println(b.readLine());
			i++;
		}
		
	}
}
