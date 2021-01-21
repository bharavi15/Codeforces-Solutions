import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class A474 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Character, Character> Lchars = new HashMap<Character, Character>();
		Map<Character, Character> Rchars = new HashMap<Character, Character>();
		char[] topLine = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
		char[] midLine = { 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', ';' };
		char[] botLine = { 'z', 'x', 'c', 'v', 'b', 'n', 'm', ',', '.', '/' };
		if (br.readLine().equals("L")) {
			for (int i = 0; i < 10; i++) {
				int r = i + 1;
				if (r == 10)
					r--;
				Rchars.put(topLine[i], topLine[r]);
				Rchars.put(midLine[i], midLine[r]);
				Rchars.put(botLine[i], botLine[r]);
			}
			String inpString = br.readLine();
			String op = "";
			for (int i = 0; i < inpString.length(); i++) {
				op += Rchars.get(inpString.charAt(i));
			}
			System.out.println(op);
		} else {
			for (int i = 0; i < 10; i++) {
				int l = i - 1;
				if (l < 0)
					l++;
				Lchars.put(topLine[i], topLine[l]);
				Lchars.put(midLine[i], midLine[l]);
				Lchars.put(botLine[i], botLine[l]);
			}
			String inpString = br.readLine();
			String op = "";
			for (int i = 0; i < inpString.length(); i++) {
				op += Lchars.get(inpString.charAt(i));
			}
			System.out.println(op);
		}

	}
}