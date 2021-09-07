package arrays.problems;

import java.util.Arrays;
import java.util.TreeSet;

public class SortingTest {

	public static void main(String[] args) {
		int[] org = { 10, 20, 30, 40 };
		int[] res = new int[org.length - 1];
		for (int i = 0, k = 0; i < org.length; i++) {
			if (i == 2)
				continue;
			else
				res[k++] = org[i];
		}
		System.out.println("Arrays -->" + Arrays.toString(res));

		TreeSet<Integer> findKeyValue = new TreeSet<>();
		findKeyValue.add(1);
		findKeyValue.add(2);
		
		

	}

}
