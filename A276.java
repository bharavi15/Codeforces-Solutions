import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A276 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inps = br.readLine().split(" ");
		int n = Integer.parseInt(inps[0]);
		int k = Integer.parseInt(inps[1]);
		int maxFun = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			String[] res = br.readLine().split(" ");
			int fi = Integer.parseInt(res[0]);
			int fun = fi;
			int ti = Integer.parseInt(res[1]);
			if (ti > k)
				fun = fi - (ti - k);

			if (fun > maxFun)
				maxFun = fun;
		}
		System.out.println(maxFun);
	}
}