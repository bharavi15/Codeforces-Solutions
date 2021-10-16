import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1367 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			char[] inp = br.readLine().toCharArray();
			String op = "";
			op += inp[0];
			for (int i = 1; i < inp.length - 2; i += 2) {
				if (inp[i] == inp[i + 1]) {
					op += inp[i];
				}
			}
			op += inp[inp.length - 1];
			System.out.println(op);
		}
	}
}