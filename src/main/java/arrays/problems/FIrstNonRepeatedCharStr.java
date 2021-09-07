package arrays.problems;

import java.lang.reflect.Array;
import java.util.concurrent.ConcurrentHashMap;

public class FIrstNonRepeatedCharStr {

	public static void main(String[] args) {

		String str1 = "aaabbc";
		System.out.println("The given string is: " + str1);
		for (int i = 0; i < str1.length(); i++) {
			boolean unique = true;
			for (int j = 0; j < str1.length(); j++) {
				if (i != j && str1.charAt(i) == str1.charAt(j)) {
					unique = false;
					break;
				}
			}
			if (unique) {
				System.out.println("The first non repeated character in String is: " + str1.charAt(i));
				break;
			}
		}

		// TODO: SECOND APPROCH :
		// Java program to find first
		// non-repeating character

		String str = "aaabbcd";
		int index = firstNonRepeating(str);

		System.out.println(index == -1 ? "Either all characters are repeating or string " + "is empty"
				: "First non-repeating character is " + str.charAt(index));
	}

	static final int NO_OF_CHARS = 256;
	static char count[] = new char[NO_OF_CHARS];

	/*
	 * calculate count of characters in the passed string
	 */
	static void getCharCountArray(String str) {
		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i)]++;
	}

	/*
	 * The method returns index of first non-repeating character in a string. If all
	 * characters are repeating then returns -1
	 */
	static int firstNonRepeating(String str) {
		getCharCountArray(str);
		int index = -1, i;

		for (i = 0; i < str.length(); i++) {
			if (count[str.charAt(i)] == 1) {
				index = i;
				break;
			}
		}

		return index;
	}
}
