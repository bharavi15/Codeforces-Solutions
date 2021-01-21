import java.io.*;

//https://codeforces.com/problemset/problem/4/A
public class A4 {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		boolean isPos = false;
		for (int i = 1; i < n; i++) {
			if ((i % 2) == 0 && (n - i) % 2 == 0) {
				isPos = true;
				break;
			}
		}
		System.out.println((isPos ? "YES" : "NO"));
	}
}