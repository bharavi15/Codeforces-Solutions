import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class A1348 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter T:");
		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			System.out.print("Enter n:");
			int n = Integer.parseInt(br.readLine());
			int f = 1;
			List<Integer> fhalf = new ArrayList<>();
			List<Integer> shalf = new ArrayList<>();
			int maxDiff = 0;
			while (f <= n / 2) {
				fhalf.add((int) Math.pow(2, f));
				shalf.add((int) Math.pow(2, f + n / 2));
				f++;
			}
			f = 1;
			while (f <= n / 2) {
				fhalf.add((int) Math.pow(2, f));
				shalf.add((int) Math.pow(2, f + n / 2));
				f++;
			}
			System.out.println(fhalf);
			System.out.println(shalf);
		}
	}
}