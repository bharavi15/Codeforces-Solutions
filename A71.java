import java.io.*;

//https://codeforces.com/problemset/problem/71/A
public class A71 {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String st = "";
		while ((st = br.readLine()) != null) {
			if (st.length() <= 10) {
				System.out.println(st);
			} else {
				System.out.print(st.charAt(0));
				System.out.print(st.length() - 2);
				System.out.println(st.charAt(st.length() - 1));
			}
		}
	}
}