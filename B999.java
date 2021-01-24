import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B999 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder inp = new StringBuilder(br.readLine());
		for (Integer i : findFactors(n)) {
			inp.replace(0, i, new StringBuilder(inp.substring(0, i)).reverse().toString());
		}
		System.out.println(inp);
	}

	public static List<Integer> findFactors(int n) {
		List<Integer> l = new ArrayList<Integer>();
		int maxVal = (n / 2 + 1);
		l.add(1);
		for (int i = 2; i <= maxVal; i++)
			if (n % i == 0)
				l.add(i);
		if (!l.contains(n))
			l.add(n);
		return l;
	}
}