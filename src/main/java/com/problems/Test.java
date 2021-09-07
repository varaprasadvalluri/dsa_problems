package com.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class Test implements TestQ, TestIn {

	public static void main(String[] args) {
		String str = "000.12.12.034";

		// System.out.printf("formating object ---> %d%f" + 10, 10);
		System.out.printf("%-15s%03d%n", 1, 6);
		try {
			Pattern pa = Pattern.compile("0[2-5]");
			System.out.println("valid");
		} catch (Exception e) {
			System.out.println("Invalid");
		}

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String pattern = in.nextLine();
			// Write your code
			try {
				Pattern pa = Pattern.compile(pattern);
				System.out.println("Valid");
				break;
			} catch (Exception e) {
				System.out.println("Invalid");
				break;
			}
		}
		in.close();

		//
		int n = 6;
		int s = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				s = i + s;
		}

		System.out.println("sum -->" + s);
		Test te = new Test();
		te.addTest();
		List<Integer> numList = new ArrayList<>();
		numList.add(5);
		numList.add(12);
		numList.add(10);
		Predicate<Integer> pred = i -> i > 5;
		numList.stream().filter(i -> i > 5).forEach(i -> System.out.println(i));

		Function<Integer, Integer> fun = i -> i / 2;
		numList.stream().map(fun).forEach(System.out::println);
	}

	@Override
	public void addTest() {
		System.out.println("AddTest -->");
	}

}
