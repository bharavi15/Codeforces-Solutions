import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A344 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String currInput = "";
		int count = 0;
		while (n-- > 0) {
			String inp = br.readLine();
			if (!inp.equals(currInput)) {
				count++;
				currInput = inp;
			}
		}
		System.out.println(count);
	}
}