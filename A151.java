import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A151 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		int nl = Integer.parseInt(st.nextToken());
		int np = Integer.parseInt(st.nextToken());
		int drinkToasts = (int) Math.floor((k * l) / nl);
		int limeToast = (int) c * d;
		int saltToast = (int) Math.floor(p / np);
		// System.out.println("drinkToasts= " + drinkToasts + " limeToast=" + limeToast
		// + " saltToast=" + saltToast);
		System.out.println((int) Math.floor(Math.min(drinkToasts, Math.min(limeToast, saltToast)) / n));
	}

}