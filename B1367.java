import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1367 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			int n = Integer.parseInt(br.readLine());
			String[] nos = br.readLine().split(" ");
			int misplacedOdds = 0, misplacedEvens = 0, num;
			boolean isOdd = false;
			for (int i = 0; i < n; i++) {
				num = Integer.parseInt(nos[i]);

				if (num % 2 != i % 2) {
					if (isOdd)
						misplacedOdds++;
					else
						misplacedEvens++;
				}
				isOdd = !isOdd;
			}
			System.out.println((misplacedEvens == misplacedOdds ? misplacedEvens : "-1"));

		}
	}
}