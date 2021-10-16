import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class basics {
	public static void main(String args[]) throws IOException {
		// Accepting input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		// Accepting String input
		String s = br.readLine();

		// Accepting array as input 1 2 3 4 5
		int size = Integer.parseInt(br.readLine());
		int[] numbers = new int[size];
		String numberString = br.readLine();
		String[] listOfNumbersString = numberString.split(" ");
		for (int i = 0; i < size; i++) {
			numbers[i] = Integer.parseInt(listOfNumbersString[i]);
		}

		// Sorting an array
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				int temp;
				if (numbers[i] > numbers[j]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		System.out.println(numbers.toString());

		// StringBuilder concepts
		StringBuilder sb = new StringBuilder(s);
		sb.reverse().toString();

		List<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(50);
		arr.add(40);
		Collections.sort(arr, Collections.reverseOrder());
		System.out.println(arr);
	}
}