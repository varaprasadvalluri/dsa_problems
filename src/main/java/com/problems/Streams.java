package com.problems;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.problems.java8.Employee;

public class Streams extends OverrideSuper{

	public static void main(String[] args) {
		Map<Employee, Integer> empMap = new HashMap<Employee, Integer>();
		empMap.put(new Employee(2, "Apple"), 1);
		empMap.put(new Employee(1, "test2"), 1);
		empMap.forEach((k, v) -> System.out.println(k + "" + v));
		LocalDate local = LocalDate.now();
		//local.atTime(hour, minute, second);
		System.out.println(local);

		//long[] mobile= {,};
		
		
		
		//
		String str = "test";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		reverse(str);
		// System.out.println("reverse -->" + );

		OverrideSuper superClass = new Streams();
		superClass.getMessage();
	}

	static void reverse(String str) {
		if ((str == null) || (str.length() <= 1))
			System.out.println(str);
		else {
			System.out.print(str.charAt(str.length() - 1));
			reverse(str.substring(0, str.length() - 1));
		}
	}
	//@Override
	public static void getMessage() {
		System.out.println("GteMessage: child");
	}
}
