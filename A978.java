import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class A978 {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String[] input = br.readLine().split(" ");
		List<Integer> hs = new ArrayList<Integer>();
		for (String var : input) {
			Integer n = Integer.parseInt(var);
			if (hs.contains(n))
				hs.remove(n);
			hs.add(n);
		}
		System.out.println(hs.size());
		for (int num : hs) {
			System.out.print(num + " ");
		}
	}
}