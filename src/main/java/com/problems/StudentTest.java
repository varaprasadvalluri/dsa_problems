package com.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentTest {
	static int i = 0;
	static int j = 0;

	void get() {
		// System.out.println(i +"" +j);
		System.out.println("Test ");
		try {

			System.out.println("B 00");
			// new StudentTest().get();
			return;
		} finally {
			System.out.println("A 11");
		}
	}

	public static void main(String[] args) {
		new StudentTest().get();
		int i = 9, j = 90;

		System.out.println("C");

		class Inner {
			private void Sysout() {

			}
		}
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("abc", 30));
		studentList.add(new Student("abc", 28));
		studentList.add(new Student("abc", 10));
		studentList.add(new Student("abc", 5));
		studentList.add(new Student("aaa", 27));

		// IntStream.range(0, studentList.size());
		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return Double.compare(o1.getAge(), o2.getAge());
			}
		}.reversed());
		studentList.stream().sorted(Comparator.comparingInt(Student::getAge));
		System.out.println("student distict -->");
		List<Integer> list = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5);

		System.out.println("The distinct elements are :");

		// Displaying the distinct elements in the list
		// using Stream.distinct() method
		list.stream().distinct().forEach(System.out::println);
		//list.sort);

		studentList.stream().filter(x -> x.getAge() < 27).collect(Collectors.toMap(Student::getAge, Student::getName));
		// empList.stream().foreach(emp -> if(emp.getSlary()>10000){
		// map.put(emp.getName().subString(0,4), emp.getSalary());});

		// studentList.stream().mapToInt(x -> x.getName()).count();
		// IntStream.
		System.out.println("Student list 2222-->" + studentList);
		String[] irr = {"3","2"};
		Arrays.sort(irr, (s1, s2) -> s1.length()- s2.length());
		System.out.println("irrrr   ---->"+Arrays.toString(irr));

		int a = 10;
		int b = 20;

		if (++a <= 10 && --b < 20) {
		}
		System.out.println("Output of && operator: " + "a = " + a + " b = " + b);
		System.out.println("-------------");
		a = 10;
		b = 20;
		if (++a <= 10 & --b < 20) {
		}
		System.out.println("Output of & operator: " + "a = " + a + " b = " + b);

		System.out.println('j' + 'a' + 'v' + 'a');

		char c = 'z';
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("is Viwels -->" + c);
			break;
		default:
			System.out.println("not a vowls " + c);
		}

		// Interview Question most important
		// A yy = new B();

		// System.out.println(" -->"+yy.print());
	}

	class A {
		public void test() {
			System.out.println("test in A");
		}
	}

	class B extends A {
		public void test() {
			System.out.println("test in B");
		}

		public void print() {
			System.out.println("print in B");
		}
	}

}
