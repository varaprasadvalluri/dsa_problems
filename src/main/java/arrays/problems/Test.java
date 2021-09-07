package arrays.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

public class Test implements functionalInterfaceA {
	// entry hap
	//

	public static void main(String... args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		shuffle(arr, 3);
		int n = arr.length, k = 3;

		// Stack<Integer> stack1 = new Stack<Integer>();
		//
		// int[] temp = new int[arr.length];
		// int l = arr.length - 1, r = 0;
		// for (int i = 0; i < n; i++) {
		// if (k > i) {
		// arr[l--] = arr[r++];
		// arr[r] = arr[l];
		// }
		// //else
		// //arr[i] = arr[l--];
		// }
		System.out.println("array -->" + Arrays.toString(arr));
		Test te = new Test();
		te.add(1);
		functionalInterfaceA.add();
		functionalInterfaceA.add((long) 1, (long) 2);

		Function<Integer, Double> half = a -> a / 2.0;

		// Now treble the output of half function
		half = half.andThen(a -> 3 * a);

		// apply the function to get the result
		System.out.println(half.apply(10));

		Function i = Function.identity();

		System.out.println(i);

		// Consumer to display a number
		Consumer<Integer> display = a -> System.out.println(a);

		// Implement display using accept()
		display.accept(10);

		// Consumer to multiply 2 to every integer of a list
		Consumer<List<Integer>> modify = list -> {
			for (int l = 0; l < list.size(); l++)
				list.set(l, 2 * list.get(l));
		};

		// Consumer to display a list of numbers
		Consumer<List<Integer>> dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));

		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		list.add(3);

		// Implement modify using accept()
		modify.accept(list);

		// Implement dispList using accept()
		dispList.accept(list);

		// Simple predicate for checking equality
		BiPredicate<Integer, String> biPredicate = (o, s) -> {
			if (o == Integer.parseInt(s))
				return true;
			return false;
		};

		System.out.println(biPredicate.test(2, "2"));

		
		// Predicate for checking greater than
		BiPredicate<Integer, String> biPredicate1 = (o, s) -> {
			if (o > Integer.parseInt(s))
				return true;
			return false;
		};

		// ANDing the two predicates
		BiPredicate<Integer, String> biPredicate2 = biPredicate.and(biPredicate1);
		System.out.println(biPredicate2.test(2, "3"));

		// ORing the two predicates
		biPredicate2 = biPredicate.or(biPredicate1);
		System.out.println(biPredicate2.test(3, "2"));

		// Negating the predicate
		biPredicate2 = biPredicate.negate();
		System.out.println(biPredicate2.test(3, "2"));
	}

	public static int[] shuffle(int[] nums, int n) {
		int[] res = new int[2 * n];
		for (int i = 0; i < nums.length; i++)
			res[i] = i % 2 == 0 ? nums[i / 2] : nums[n + i / 2];
		return res;
	}

	@Override
	public void add(int a, long b) {
		// TODO Auto-generated method stub
		
	}

}
