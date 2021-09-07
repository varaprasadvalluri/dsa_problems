package arrays.problems;

// Java program to demonstrate difference between 
// HashSet, LinkedHashSet and TreeSet 
// according to insertion order and insertion time 

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class GFG1 {
	// Function show insertion order of LinkedHashSet, TreeSet and HashSet

	private static void insertionOrder() {
		LinkedHashSet<String> geekLinkSet = new LinkedHashSet<>();
		TreeSet<String> geekTreeSet = new TreeSet<>();
		HashSet<String> geekHashSet = new HashSet<String>();

		// Add three object in
		// LinkedHashSet and TreeSet
		for (String str : Arrays.asList("Geek2", "Geek1", "Geek3", "Geek1")) {

			geekLinkSet.add(str);
			geekTreeSet.add(str);
			geekHashSet.add(str);
		}

		// should be sorted order HashSet
		// stores element in sorted order
		System.out.println("Insertion Order" + " of objects in HashSet :" + geekHashSet);

		// insertion order or elements LinkedHashSet
		// storeds elements as insertion
		System.out.println("Insertion Order of " + "objects in LinkedHashSet :" + geekLinkSet);

		// should be sorted order TreeSet
		// stores element in sorted order
		System.out.println("Insertion Order of" + " objects in TreeSet :" + geekTreeSet);
	}

	// Function calculate insertion time of
	// 1000 objects of LinkedHashSet,
	// TreeSet and HashSet

	private static void insertionTime() {
		// HashSet performance Test
		// inserting 1000 elements
		HashSet<Integer> numbersHS = new HashSet<>();
		long startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			numbersHS.add(i);
		}
		long endTime = System.nanoTime();
		System.out.println("Total time to insert" + " 1000 elements in" + " HashSet in sec : " + (endTime - startTime));

		// LinkedHashSet performance Test
		// inserting 1000 elements
		LinkedHashSet<Integer> numbersLLS = new LinkedHashSet<>();

		startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			numbersLLS.add(i);
		}
		endTime = System.nanoTime();
		System.out.println(
				"Total time to insert" + " 1000 elements in" + " LinkedHashSet in sec : " + (endTime - startTime));

		// TreeSet performance Test inserting 1000 objects
		TreeSet<Integer> numbersTS = new TreeSet<>();

		startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			numbersTS.add(i);
		}
		endTime = System.nanoTime();
		System.out.println("Total time to insert" + " 1000 elements in" + " TreeSet in sec : " + (endTime - startTime));
	}

	// Function calculate deletion time
	// of 1000 objects LinkedHashSet,
	// TreeSet and HashSet
	// Deletion time always vary
	private static void deletion() {
		// HashSet performance Test inserting
		// and deletion 1000 elements
		HashSet<Integer> deletionHS = new HashSet<>();

		for (int i = 0; i < 1000; i++) {
			deletionHS.add(i);
		}

		long startingTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			deletionHS.remove(i);
		}

		long endedTime = System.nanoTime();
		System.out.println(
				"Total time to Deletion " + "1000 elements in HashSet in sec : " + Math.abs(startingTime - endedTime));

		// LinkedHashSet performance Test inserting
		// and deletion 1000 elements
		LinkedHashSet<Integer> deletionLLS = new LinkedHashSet<>();

		for (int i = 0; i < 1000; i++) {
			deletionLLS.add(i);
		}
		startingTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			deletionLLS.remove(i);
		}

		endedTime = System.nanoTime();
		System.out.println("Total time to Deletion 1000" + " elements in LinkedHashSet in sec : "
				+ Math.abs(startingTime - endedTime));

		// TreeSet performance Test inserting
		// and deletion 1000 elements
		TreeSet<Integer> deletionTS = new TreeSet<>();

		for (int i = 0; i < 1000; i++) {
			deletionTS.add(i);
		}

		startingTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			deletionTS.remove(i);
		}

		endedTime = System.nanoTime();
		System.out.println(
				"Total time to Deletion 1000" + " elements in TreeSet in sec : " + Math.abs(startingTime - endedTime));
	}

	public static void main(String args[]) {

		insertionOrder();
		insertionTime();
		deletion();
	}
}
