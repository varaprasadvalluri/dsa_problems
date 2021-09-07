package arrays.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem1 {

	// Adding Two sum
	public void sentMessage() {
		System.out.println("Hi");
	}

	public static void main(String[] str) {

		int[] array = { 2, 7, 11, 15 };
		int[] map = twoSum(array, 17);
		// System.out.println("map --->" + Arrays.toString(map));

		System.out.println("Sum of two -->" + Arrays.toString(runningSum(array)));

		int arr[] = { 12, 35, 1, 10, 34, 1 };
		int n = arr.length;
		print2largest(arr, n);

		int[] indices = {};
		// suffle("", indices);
	}
	// JAVA Code for Find Second largest
	// element in an array

	/*
	 * Function to print the second largest elements
	 */
	public static void print2largest(int arr[], int arr_size) {
		int i, first, second;

		/* There should be atleast two elements */
		if (arr_size < 2) {
			System.out.print(" Invalid Input ");
			return;
		}

		first = second = Integer.MIN_VALUE;
		for (i = 0; i < arr_size; i++) {
			/*
			 * If current element is smaller than first then update both first and second
			 */
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			}

			/*
			 * If arr[i] is in between first and second then update second
			 */
			else if (arr[i] > second && arr[i] != first)
				second = arr[i];
		}

		if (second == Integer.MIN_VALUE)
			System.out.print("There is no second largest" + " element\n");
		else
			System.out.print("The second largest element" + " is " + second);
	}
	// This code is contributed by Arnav Kr. Mandal.

	static int[] runningSum(int[] nums) {
		for (int i = 1; i < nums.length; i++)
			nums[i] += nums[i - 1];
		return nums;
	}

	static int[] findTwoSum(int[] a, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> resMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {

			resMap.put(a[i], i);

		}

		return result;
	}

	static String suffle(String s, int[] indices) {
		char[] ch = new char[indices.length];

		for (int i = 0; i < s.length(); i++)
			ch[indices[i]] = s.charAt(i);

		return new String(ch);
	}

	public int reverse(int x) {
		long r = 0;

		while (x != 0) {
			r = r * 10 + (x % 10);
			x /= 10;
		}

		if (r < Integer.MIN_VALUE || r > Integer.MAX_VALUE)
			return 0;
		else
			return (int) r;
	}

	private static int[] twoSum(int[] array, int target) {
		Arrays.sort(array);
		int l, r;
		l = 0;
		r = array.length - 1;
		while (l < r) {
			if (array[l] + array[r] == target) {
				// map.put(l, r);
				return new int[] { l, r };
			} else if (array[l] + array[r] < target) {
				l++;
			} else
				r--;
		}
		throw new IllegalArgumentException("No Two Sum Availble");
	}

	static int getSum(int n) {
		int sum;

		/* Single line that calculates sum */
		for (sum = 0; n > 0; sum += n % 10, n /= 10)
			;

		return sum;
	}

	static int findSumOfint(int sum) {
		return sum == 0 ? 0 : sum % 10 + findSumOfint(sum / 10);

	}

}
