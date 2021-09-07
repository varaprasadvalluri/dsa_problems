package arrays.problems;

public class ReverseInteger {

	public static void main(String[] args) {
		int input = 345, revs = 0;
		while (input != 0) {
			int temp = input % 10;
			revs = revs * 10 + temp;
			input /= 10;
		}
		System.out.println("revser --->" + revs);
	}
}
