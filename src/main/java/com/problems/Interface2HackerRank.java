package com.problems;

import java.util.Scanner;

public class Interface2HackerRank {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for (int i = 0; i < numScores; i++) {
			testScores[i] = scan.nextInt();
		}
		scan.close();

		Student1 s = new Student1(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}

}

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Person(String firstName, String lastName, int identification) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	// Print person data
	public void printPerson() {
		System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
	}

}

class Student1 extends Person {
	private int[] testScores;

	/*
	 * Class Constructor
	 * 
	 * @param firstName - A string denoting the Person's first name.
	 * 
	 * @param lastName - A string denoting the Person's last name.
	 * 
	 * @param id - An integer denoting the Person's ID number.
	 * 
	 * @param scores - An array of integers denoting the Person's test scores.
	 */
	// Write your constructor here

	/*
	 * Method Name: calculate
	 * 
	 * @return A character denoting the grade.
	 */
	// Write your method here

	public String calculate() {
		int total = 0;
		for (int i = 0; i < testScores.length; i++) {
			total += testScores[i];
		}
		int avg = total / testScores.length;
		System.out.println("avg -->" + avg);

		if (avg < 40)
			return "T";
		else if (avg < 55)
			return "D";
		else if (avg < 70)
			return "P";
		else if (avg < 80)
			return "A";
		else if (avg < 90)
			return "E";
		else
			return "O";

	}

	public Student1(String firstName, String lastName, int identification, int[] testScores) {

		super(firstName, lastName, identification);
		// TODO Auto-generated constructor stub
		this.testScores = testScores;
	}
}