import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1206 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int neg = 0, zero = 0;
		long sum = 0;
		int N = Integer.parseInt(br.readLine());
		String[] inpStrings = br.readLine().split(" ");
		while (N-- > 0) {
			int n = Integer.parseInt(inpStrings[N]);
			if (n < 0) {
				sum += Math.abs(n) - 1;
				neg++;
			} else if (n == 0) {
				sum++;
				zero++;
			} else {
				sum += n - 1;
			}
		}
		if (neg % 2 != 0 && zero <= 0) {
			sum += 2;
		}
		System.out.println(sum);
	}
}