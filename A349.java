import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A349 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int denoCount25 = 0;
		int denoCount50 = 0;
		int denoCount100 = 0;
		String[] nos = br.readLine().split(" ");
		for (String no : nos) {
			int num = Integer.parseInt(no);
			if (num == 25) {
				denoCount25++;
				// System.out.println("Accepted 25");
			} else if (num == 50) {
				if (denoCount25 >= 1) {
					denoCount25--;
					denoCount50++;
					// System.out.println("Gave 25");
				} else {
					System.out.println("NO");
					return;
				}
			}
			if (num == 100) {
				if (denoCount50 >= 1 && denoCount25 >= 1) {
					denoCount50--;
					denoCount25--;
					// System.out.println("Gave 50+25");

				} else if (denoCount25 >= 3) {
					denoCount25 -= 3;
					// System.out.println("Gave 25+25+25");

				} else {
					System.out.println("NO");
					return;
				}
			}
		}
		System.out.println("YES");
	}
}