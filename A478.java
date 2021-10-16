import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A478 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int n = 5;
		int sum = 0;
		while (n-- > 0) {
			sum += Integer.parseInt(s.nextToken());
		}
		System.out.println((sum % 5 == 0 && sum != 0) ? sum / 5 : -1);
	}
}