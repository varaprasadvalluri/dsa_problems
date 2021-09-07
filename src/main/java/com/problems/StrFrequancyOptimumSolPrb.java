package com.problems;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StrFrequancyOptimumSolPrb {

	public static void main(String[] args) {

		String[] strArray = { "google", "facebook", "facebook" };

		Map<String, Integer> countMap = new HashMap<>();

		for (int i = 0; i < strArray.length; i++) {

			if (countMap.containsKey(strArray[i])) {
				countMap.put(strArray[i], countMap.get(strArray[i]) + 1);
			} else {
				countMap.put(strArray[i], 1);
			}
		}
		System.out.println("countMap -->" + countMap);
		int maxVal = 0;
		String maxStr = "";
		for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
			String key = entry.getKey();
			Integer count = entry.getValue();
			if (count > maxVal) {
				maxVal = count;
				maxStr = key;
			}
			// Condition for the tie.
			else if (count == maxVal) {
				if (key.length() < maxStr.length())
					maxStr = key;
			}
		}
		System.out.println("maxStr -->" + maxStr);
		// java8 frequancy
		String mostRepeatedWord = Stream.of(strArray).collect(Collectors.groupingBy(w -> w, Collectors.counting()))
				.entrySet().stream().max(Comparator.comparing(Entry::getValue)).get().getKey();
		System.out.println("most repeated word -->" + mostRepeatedWord);
	}
}
