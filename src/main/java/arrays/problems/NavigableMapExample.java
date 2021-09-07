package arrays.problems;

import java.util.HashSet;
//Java program to demonstrate
//the NavigableMap interface
import java.util.NavigableMap;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Callable;

public class NavigableMapExample implements Callable<Test> {

	public static void main(String[] args) {
		// Instantiate an object
		// Since NavigableMap
		// is an interface so we
		// use TreeMap
		NavigableMap<String, Integer> nm = new TreeMap<String, Integer>();

		SortedSet<String> sort=new TreeSet<>();
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		// Adding items to the pQueue using add()
		pQueue.add(10);
		pQueue.add(20);
		pQueue.add(15);
		Set<String> set = new HashSet<>();
		// Printing the top element of PriorityQueue
		System.out.println(pQueue.peek());

		// Printing the top element and removing it
		// from the PriorityQueue container
		System.out.println(pQueue.poll());

		// Printing the top element again
		System.out.println(pQueue.peek());

		// Add elements using put() method
		nm.put("C", 888);
		nm.put("Y", 999);
		nm.put("A", 444);
		nm.put("T", 555);
		nm.put("B", 666);
		nm.put("A", 555);

		// Print the contents on the console
		System.out.println("Mappings of NavigableMap : " + nm);

		System.out.printf("Descending Set : %s%n", nm.descendingKeySet());
		System.out.printf("Floor Entry : %s%n", nm.floorEntry("L"));
		System.out.printf("First Entry : %s%n", nm.firstEntry());
		System.out.printf("Last Key : %s%n", nm.lastKey());
		System.out.printf("First Key : %s%n", nm.firstKey());
		System.out.printf("Original Map : %s%n", nm);
		System.out.printf("Reverse Map : %s%n", nm.descendingMap());
		
		sort.add("A");
		//sort.
		
	}

	@Override
	public Test call() throws Exception {

		return null;
	}
}
