package com.problems;

import java.time.LocalDate;

public class CompareDates {
	// Java program to compare Dates

	public static void main(String[] args) {

		// Create LocalDate objects with dates
		LocalDate d1 = LocalDate.of(2016, 12, 15);
		LocalDate d2 = LocalDate.of(2017, 01, 15);

		// Print the Dates
		System.out.println("Date1: " + d1);
		System.out.println("Date2: " + d2);

		// Compare the dates
		if (d1.isAfter(d2)) {

			// When Date d1 > Date d2
			System.out.println("Date1 is after Date2");
		}

		
		else if (d1.isBefore(d2)) {

			// When Date d1 < Date d2
			System.out.println("Date1 is before Date2");
		}

		else if (d1.isEqual(d2)) {

			// When Date d1 = Date d2
			System.out.println("Date1 is equal to Date2");
		}

		//

		System.out.println("CompareTo...");
		if (d1.compareTo(d2) > 0) {

			System.out.println("Date1 is after Date2");

		} else if (d1.compareTo(d2) < 0) {

			System.out.println("Date1 is before Date2");

		} else if (d1.compareTo(d2) == 0) {

			System.out.println("Date1 is equal to Date2");

		} else {

			System.out.println("How to get here?");

		}
	}

}
