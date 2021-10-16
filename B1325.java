import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;;

public class B1325 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			int n = Integer.parseInt(br.readLine());
			String[] a = br.readLine().split(" ");
			List<Integer> l = new ArrayList<>();
			for (String i : a) {
				l.add(Integer.parseInt(i));
			}
			while (n-- > 0)
				l.addAll(l);
			System.out.println(l);
StringBuilder s = new StringBuilder().sub
			int min = Collections.min(l);
			Integer minCount = 1;
			for (Integer i : l) {
				if (i > min) {
					min = i;
					minCount += 1;
				}
			}
			System.out.println(minCount);
		}
	}
}