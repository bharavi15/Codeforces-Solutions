import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B688 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder b = new StringBuilder(br.readLine());
		System.out.println(b.toString() + new StringBuilder(b).reverse());
	}
}