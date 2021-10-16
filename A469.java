import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class A469 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Set<Integer> X = new HashSet<>();

		StringTokenizer st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			int a = Integer.parseInt(st.nextToken());
			if (a != 0) {
				X.add(a);
			}
		}

		st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			int a = Integer.parseInt(st.nextToken());
			if (a != 0) {
				X.add(a);
			}
		}

		if (X.size() == n) {
			System.out.println("I become the guy.");
		} else {
			System.out.println("Oh, my keyboard!");
		}

	}
}