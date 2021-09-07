package com.problems;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class HackerRankCountPairs {
	/*
	 * Complete the 'countPairs' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER_ARRAY numbers 2. INTEGER k
	 */

	public static int countPairs(List<Integer> numbers, int k) {
		int count = 0;
		Map<Integer, Integer> numCount = new HashMap<>();
		for (int i = 0; i < numbers.size(); i++) {
			if (Objects.isNull(numCount.get(numbers.get(i)))) {
				numCount.put(numbers.get(i), 1);
			}
		}
		for (int i = 0; i < numbers.size(); i++) {
			if (Objects.nonNull(numCount.get((numbers.get(i) + k)))) {
				count++;
				numCount.remove((numbers.get(i) + k));
			}
		}
		return count;
	}
}
