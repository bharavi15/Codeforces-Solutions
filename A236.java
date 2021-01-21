import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class A236 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inp = br.readLine();
		Set<Character> s = new HashSet<Character>();
		for (int i = 0; i < inp.length(); i++) {
			s.add(inp.charAt(i));
		}
		if (s.size() % 2 != 0) {
			System.out.println("IGNORE HIM!");
		} else {
			System.out.println("CHAT WITH HER!");
		}
	}
}