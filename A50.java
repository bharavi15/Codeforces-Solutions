import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A50 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] st = (br.readLine()).split(" ");
		int m = Integer.parseInt(st[0]);
		int n = Integer.parseInt(st[1]);
		System.out.println((int) (m * n / 2));
	}
}