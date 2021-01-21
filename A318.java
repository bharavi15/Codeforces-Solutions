import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A318 {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inps = br.readLine().split(" ");
		int n = Integer.parseInt(inps[0]);
		int k = Integer.parseInt(inps[1]);
		if (k >= n / 2) {
			k = k - (int) Math.ceil(n / 2);
			System.out.println("k is= " + k);
			System.out.println(2 * k);
		} else {
			System.out.println(2 * k - 1);
		}
	}
}