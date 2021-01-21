import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1409 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			String[] inps = br.readLine().split(" ");
			int a = Integer.parseInt(inps[0]);
			int b = Integer.parseInt(inps[1]);
			if (a > b) {
				int temp = b;
				b = a;
				a = temp;
			}
			int count = (b - a) / 10;
			if ((b - a) % 10 != 0) {
				count++;
			}
			System.out.println(count);
		}
	}
}