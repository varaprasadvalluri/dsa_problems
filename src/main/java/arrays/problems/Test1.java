package arrays.problems;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Test1 implements TestImpl {

	// {Google,{2,3,4}},facebook{1,2,3},gmail{1,2,3},instagram{1,2,3}

	private static int avr(String campnay, List<Integer> ratings) {
		int total = 0;
		for (int i = 0; i < ratings.size(); i++) {
			total += total + ratings.get(i);
		}
		int av = total / ratings.size();
		System.out.println("av -->" + av);
		return av;
	}

	BiFunction<Integer, Integer, Integer> res = (insta, inst) -> {

		return insta;

	};

	public static void main(String[] args) {

		TreeSet<Integer> ints = new TreeSet<>();
		ints.add(new Integer(1));
		ints.add(new Integer(1));
		ints.add(new Integer(2));
		ints.add(1);
		TreeMap<String, Integer> tmp = new TreeMap<String, Integer>();

		// PriorityQueue<E>
		System.out.println("setSize -->" + ints.size());
		List<Integer> ratings = Arrays.asList(1, null, 3, 4);
		Map<String, List<Integer>> map = new LinkedHashMap<String, List<Integer>>();
		map.put("google", ratings);
		map.put("facebook", ratings);
		map.put("instgram", ratings);

		String s1 = new String("HELLO");
		String s2 = "HELLO";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		
		
		for (Map.Entry<String, List<Integer>> ValMap : map.entrySet()) {
			map.put("inst", Arrays.asList(1, 2));
			map.remove(ValMap.getKey());
		}
		Collections.binarySearch(ratings, 1);
		Collections.min(ratings);
		Iterator<String> iterator = map.keySet().iterator();

		System.out.println("after: " + map);

	}

	public String add() {
		// TODO Auto-generated method stub
		return null;
	}

	public void te() {
		// TODO Auto-generated method stub

	}

}
