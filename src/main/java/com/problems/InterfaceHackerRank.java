package com.problems;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterfaceHackerRank {

	public static void main(String[] args) {
		// MyCalculator my_calculator = new MyCalculator();
		// System.out.print("I implemented: ");
		// ImplementedInterfaceNames(my_calculator);
		// Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
		// System.out.print(my_calculator.divisor_sum(n) + "\n");
		// sc.close();
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\\Z");
		String str = "He is a very very good boy, isn't he?";
		String[] strAry = str.split("[ !,?._'@]+");
		System.out.println(strAry.length);
		for (int i = 0; i < strAry.length; i++) {
			System.out.println("str --->" + strAry[i]);
		}
		int[] inAr = { 1, 2, 4 };
		String[] strUk = { "AV", "AD" };
		//addGeneric(inAr);

	}

	interface AdvancedArithmetic {
		int divisor_sum(int n);
	}

	// Write your code here
	static class MyCalculator implements AdvancedArithmetic {
		@Override
		public int divisor_sum(int n) {
			int sum = 0;
			for (int i = 0; i < n; i++)
				sum = i;
			return sum % n;
		}

	}

	static <T> void addGeneric(T[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

	/*
	 * ImplementedInterfaceNames method takes an object and prints the name of the
	 * interfaces it implemented
	 */
	static void ImplementedInterfaceNames(Object o) {
		Class[] theInterfaces = o.getClass().getInterfaces();
		for (int i = 0; i < theInterfaces.length; i++) {
			String interfaceName = theInterfaces[i].getName();
			System.out.println(interfaceName);
		}
	}

}
