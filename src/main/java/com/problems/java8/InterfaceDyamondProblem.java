package com.problems.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
interface MyInterface1 {
	public static int num = 100;

	public default void display() {
		System.out.println("display method of MyInterface1");
	}

	public int multiply(int a, int b);
}

// @FunctionalInterface
interface MyInterface2 {
	public static int num = 1000;

	public default void display() {
		System.out.println("display method of MyInterface2");
	}
}

public class InterfaceDyamondProblem implements MyInterface1, MyInterface2 {
	public void display() {
		MyInterface1.super.display();
		// or,
		MyInterface2.super.display();
		// MyInterface2 sf=(a,b)->
	}

	public static void main(String args[]) {
		InterfaceDyamondProblem obj = new InterfaceDyamondProblem();
		obj.display();
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
		// ArrayList
		// Inserting the Elements
		// using put() method
		hm.put(3, "Geeks");
		// simple operation of multiplication of 'a' and 'b'
		MyInterface1 Total = (a, b) -> a * b;
		System.out.println("Result: " + Total.multiply(30, 60));
		Stream.of(0, 1, 2, 3, 4, 5, 6, 7, 8).limit(6)
				/*
				 * limit is set to 6, hence it will print the numbers starting from 0 to 5
				 */
				.forEach(num -> System.out.print("\n" + num));
		Random random = new Random();
		random.ints().limit(5).forEach(System.out::println);

		System.out.println("Intermediate Operation won't execute");
		Arrays.stream(new int[] { 0, 1 }).map(i -> {
			System.out.println(i);
			return i;
			// No terminal operation so it won't execute
		});

		System.out.println("Terminal operation starts here");
		Arrays.stream(new int[] { 0, 1 }).map(i -> {
			System.out.println(i);
			return i;
			// This is followed by terminal operation sum()
		}).sum();

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		// Added the numbers into Arraylist
		//
		list.stream().mapToInt(i -> i).sum();
		System.out.println(list);
		long count = list.stream().count();
		System.out.println("We have " + count);
		//

		List<Employee> employees = Arrays.asList(new Employee(1, "Chandra Shekhar"), new Employee(1, "Rajesh"),
				new Employee(1, "Rahul"), new Employee(1, "Suresh"), new Employee(1, "Satosh"));
		 //List<Employee> byDept = employees.stream().collect(grou);
		int total = employees.stream().collect(Collectors.summingInt(Employee::getId));
		System.out.println("Total Employees Salary : " + total);
	}

	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

}