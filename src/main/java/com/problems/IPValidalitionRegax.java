package com.problems;

import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPValidalitionRegax<T, R> implements Function<T, R> {

	public static void main(String[] args) {
		// Regex for digit from 0 to 255.
		String zeroTo255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";

		// Regex for a digit from 0 to 255 and
		// followed by a dot, repeat 4 times.
		// this is the regex to validate an IP address.
		String regex = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
		Pattern pa = Pattern.compile(regex);

		Matcher match = pa.matcher("000.12.12.034:8080");
		System.out.println(match.find());
		
		//HashMap<Integer,Integer> hashSet=new HashSet<>();
	}

	@Override
	public R apply(T t) {
		// TODO Auto-generated method stub
		return null;
	}

}
