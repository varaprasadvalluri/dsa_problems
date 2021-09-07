package arrays.problems;

public class BobErikHackerRankProblem {

	public static void main(String[] args) {
		String erik = "EMHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE";
		String bob = "EMHMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH";

		// base condition
		int erikTot = 0, bobTot = 0;
		erikTot = getTotal(erik);
		bobTot = getTotal(bob);
		if (erikTot == bobTot)
			System.out.println("Tie!");
		else if (erikTot > bobTot)
			System.out.println("Erik Winner!");
		else if (bobTot > erikTot)
			System.out.println("Bob Winner!");
	}

	static int getTotal(String inputStr) {
		int total = Integer.MIN_VALUE;
		long startingTime = System.nanoTime();
		for (int i = 0; i < inputStr.length(); i++) {
			char ch = inputStr.charAt(i);
			if (ch == 'E') {
				total += 1;
			} else if (ch == 'M')
				total += 3;
			else if (ch == 'H')
				total += 5;
		}
		long endedTime = System.nanoTime();
		System.out.println("Excution Time -->" + Math.abs(startingTime - endedTime));
		return total;
	}
}
