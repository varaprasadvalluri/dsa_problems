package com.problems.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		// finding the min
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "vara"));
		empList.add(new Employee(3, "venkata"));
		empList.add(new Employee(2, "Prasad"));

		empList.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
		empList.sort(Comparator.comparing(Employee::getId));
		empList.stream().distinct().sorted();
		Employee empMin = empList.stream().min((e1, e2) -> e1.getId() - e2.getId())
				.orElseThrow(NoSuchElementException::new);
		Employee empMax = empList.stream().max((e1, e2) -> e1.getId() - e2.getId())
				.orElseThrow(NoSuchElementException::new);
		System.out.println("empMin Employee -->" + empMin.getId());
		System.out.println("empMax Employee -->" + empMax.getId());

		// distinct values (Removing duplicates)
		List<Integer> intList = Arrays.asList(2, 5, 3, 2, 4, 3);
		List<Integer> distinctIntList = intList.stream().distinct().collect(Collectors.toList());
		System.out.println("distinctIntList -->" + distinctIntList);
		// sort
		empList.sort(Comparator.comparing(Employee::getId));
		System.out.println("EmpList After sort Comparator method-->" + empList);
		empList.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
		System.out.println("EmpList After sort Comparable method-->" + empList);
		Map<Integer, String> empmap = empList.stream().filter(e -> e.getId() <= 2)
				.collect(Collectors.toMap(Employee::getId, Employee::getName));
		System.out.println("empmap -->" + empmap);

		Map<Character, List<Employee>> groupByAlphabet = empList.stream()
				.collect(Collectors.groupingBy(e -> new Character(e.getName().charAt(0))));
		System.out.println("groupByAlphabet -->" + groupByAlphabet);

		Map<Character, List<Integer>> idGroupedByAlphabet = empList.stream().collect(Collectors.groupingBy(
				e -> new Character(e.getName().charAt(0)), Collectors.mapping(Employee::getId, Collectors.toList())));

		System.out.println("idGroupedByAlphabet -->" + idGroupedByAlphabet);
		Comparator<Employee> byNameLength = Comparator.comparing(Employee::getName);
		Map<Character, Optional<Employee>> longestNameByAlphabet = empList.stream().collect(Collectors.groupingBy(
				e -> new Character(e.getName().charAt(0)), Collectors.reducing(BinaryOperator.maxBy(byNameLength))));
		System.out.println("longestNameByAlphabet -->" + longestNameByAlphabet);

		Stream.generate(Math::random).limit(5).forEach(System.out::println);

		// stream itarate same our for loop
		// intList. using reduce
		int sum = intList.stream().reduce(0, Integer::sum);
		System.out.println("Sum  -->" + sum);
		// using Collectors
		List<Integer> list = Arrays.asList(2, 4, 5, 6);
		int sum1 = list.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println("Sum1 -->" + sum1);
		// Stream.iterate(seed, f).forEach(System.out::println);

		String str = "abc";
		String str1 = new String("abc");
		Integer i = 0;
		Integer ii = new Integer(0);
		System.out.println("== -->" + (str == str1));
		System.out.println("-->" + str.equals(str1));
		System.out.println(" int == -->" + (i == ii));
		System.out.println('a' == 'b');
		System.out.println(10 == 20);
		StreamExample ex = new StreamExample();
		System.out.println(ex.i);
		// Arrays.sort(list, (s1, s2) :: s1.length() - s2.length());

		Supplier<Stream<String>> streamSupplier = () -> Stream.of("d2", "a2", "b1", "b3", "c")
				.filter(s -> s.startsWith("a"));

		streamSupplier.get().anyMatch(s -> true); // ok
		streamSupplier.get().noneMatch(s -> true); // ok
		//

		Map<Integer, List<Person>> personsByAge = persons.stream().collect(Collectors.groupingBy(p -> p.age));

		personsByAge.forEach((age, p) -> System.out.format("age %s: %s\n", age, p));
		//
		Double averageAge = persons.stream().collect(Collectors.averagingInt(p -> p.age));

		System.out.println(averageAge); // 19.0
		IntSummaryStatistics ageSummary = persons.stream().collect(Collectors.summarizingInt(p -> p.age));

		System.out.println(ageSummary);
		String phrase = persons.stream().filter(p -> p.age >= 18).map(p -> p.name)
				.collect(Collectors.joining(" and ", "In Germany ", " are of legal age."));

		System.out.println(phrase);

		Map<Integer, String> map = persons.stream()
				.collect(Collectors.toMap(p -> p.age, p -> p.name, (name1, name2) -> name1 + ";" + name2));

		System.out.println(map);
		Collector<Person, StringJoiner, String> personNameCollector = Collector.of(() -> new StringJoiner(" | "), // supplier
				(j, p) -> j.add(p.name.toUpperCase()), // accumulator
				(j1, j2) -> j1.merge(j2), // combiner
				StringJoiner::toString); // finisher

		String names = persons.stream().collect(personNameCollector);
		
		String strord="wade and wade";

		System.out.println(names); // MAX | PETER | PAMELA | DAVID
//		List<Person> persons = Arrays.asList(new Person("Max", 18), new Person("Peter", 23), new Person("Pamela", 23),
//				new Person("David", 12));
//		persons.parallelStream().reduce(0, (sum, p) -> {
//			System.out.format("accumulator: sum=%s; person=%s [%s]\n", sum, p, Thread.currentThread().getName());
//			return sum += p.age;
//		}, (sum1, sum2) -> {
//			System.out.format("combiner: sum1=%s; sum2=%s [%s]\n", sum1, sum2, Thread.currentThread().getName());
//			return sum1 + sum2;
//		});
		
		//
		//Map
		
		int[][] arry= {{1,2,3},{4,5,6},{7,6,9}};
		
		for(int iii=0;iii<arry.length;iii++) {
			for(int iiii=0;iiii<arry[iii].length;iiii++) {
				
				System.out.println("Array --> "+arry[iii][iiii]);
			}
			
		}
	}

	private static class Person {
		String name;
		int age;

		Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		@Override
		public String toString() {
			return name;
		}
	}

	static List<Person> persons = Arrays.asList(new Person("Max", 18), new Person("Peter", 23),
			new Person("Pamela", 23), new Person("David", 12));
	int i = 9;
}
