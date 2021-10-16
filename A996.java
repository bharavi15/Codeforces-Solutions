import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A996 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int notes = 0;
		int deno = 100;
		notes += n % deno;
		n = deno * (n % deno);
		deno = 20;
		notes += n % deno;
		n = deno * (n % deno);
		deno = 10;
		notes += n % deno;
		n = deno * (n % deno);
		deno = 5;
		notes += n % deno;
		n = deno * (n % deno);
		deno = 1;
		notes += n % deno;
		System.out.println(notes);
	}
}