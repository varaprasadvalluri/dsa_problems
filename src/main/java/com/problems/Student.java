package com.problems;

import java.util.Comparator;

public class Student implements Comparator<Student> {

	private String name;
	private int age;
	double percetage;

	public double getPercetage() {
		return percetage;
	}

	public void setPercetage(double percetage) {
		this.percetage = percetage;
	}

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
	}

	private Address adress;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", adress=" + adress + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
			return false;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compare(Student o1, Student o2) {
		Double d1 = new Double(o1.percetage);
		Double d2 = new Double(o1.percetage);
//		if (Collections.reverse(Double.compare(o2.getPercetage(),o1.getPercetage())) {
//			return Double.compare(d1, d2);
//		}
		return 0;
	}

}
