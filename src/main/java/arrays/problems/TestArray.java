package arrays.problems;

import java.util.ArrayList;
import java.util.List;

public class TestArray {

	public static void main(String[] args) {

		int[] a = { 1, 10, 4, 6, 8, -1 };
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		boolean[] repeat = new boolean[256];
		for (int i = 0; i < a.length - 1; i++) {
			first = a[i];// 10
			second = a[i + 1];// 20
			if (first > second)
				second = first;
			else if (second > first)
				first = second;
		}
		int res = Math.min(first, second);// 20
		System.out.println("res " + res);

		int number = 153, originalNumber, remainder, result = 0;

		originalNumber = number;

		while (originalNumber != 0) {
			remainder = originalNumber % 10;
			System.out.println("REminder -->" + remainder);
			result += Math.pow(remainder, 3);
			originalNumber /= 10;
			System.out.println();
		}

		if (result == number)
			System.out.println(number + " is an Armstrong number.");
		else
			System.out.println(number + " is not an Armstrong number.");
		String str = "aaabbc";

		List<Character> list = new ArrayList<>();
		int j = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			char ch = str.charAt(i);

			if (ch != str.charAt(j + 1)) {
				System.out.println("found! -->" + ch);
				break;
			}
			j++;
		}
		if (list.size() != 0) {
			System.out.print("The first non-repeating character of the string is ");
			System.out.println(list.get(0));
		}

		// System.out.println(result);

		int inp = 153;
		int amst = (int) Math.pow(1, 3) + (int) Math.pow(5, 3) + (int) Math.pow(3, 3);
		System.out.println("amst -->" + amst);

		//

		int devideOp = 24, moduloOp = 24;

		System.out.println("devideOp -->" + (inp / 3));
		System.out.println("Modeul -->" + (moduloOp % 12));

		int input = 123, reverser = 0;
		while (input != 0) {
			int temp = input % 10;
			reverser = reverser * 10 + temp;
			input /= 10;
		}

		System.out.println("reverse -->" + reverser);
	}

}
