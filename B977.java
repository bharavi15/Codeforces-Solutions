import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class B977 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String inp = br.readLine();
		Map<String, Integer> counts = new HashMap<>();
		for (int i = 0; i < n - 1; i++) {
			String s = inp.substring(i, i + 2);
			if (counts.containsKey(s)) {
				counts.put(s, counts.get(s) + 1);
			} else {
				counts.put(s, 1);
			}
		}
		int maxCount = 0;
		String maxString = "";
		for (String i : counts.keySet()) {
			int a = counts.get(i);
			if (a > maxCount) {
				maxCount = a;
				maxString = i;
			}
		}
		System.out.println(maxString);
	}
}