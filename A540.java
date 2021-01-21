import java.io.*;

//https://codeforces.com/problemset/problem/540/A
public class A540 {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String given = br.readLine();
		String required = br.readLine();

		int count = 0;
		for (int i = 0; i < n; i++) {
			int g = Integer.parseInt(String.valueOf(given.charAt(i)));
			int r = Integer.parseInt(String.valueOf(required.charAt(i)));
			int c = min3(Math.abs(g - r), Math.abs(g - (10 + r)), Math.abs(g + 10 - r));
			// System.out.println("For "+g+"->"+r+" needs="+c);
			count += c;
		}
		System.out.println(count);
	}

	public static int min3(int a, int b, int c) {
		return a > b ? c > b ? b : c : a > c ? c : a;
	}
}