import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1016 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inps = br.readLine().split(" ");
		int n = Integer.parseInt(inps[0]);
		int m = Integer.parseInt(inps[1]);
		String op = "";
		int remainingPages = m;
		int pagesTurned = 0;
		String[] nums = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(nums[i]);
			remainingPages = remainingPages - a;
			if (remainingPages < 1) {
				pagesTurned++;
				remainingPages = remainingPages + m;
			}
			System.out.println("remainingPages=" + remainingPages);

		}
		System.out.println(pagesTurned);
	}
}