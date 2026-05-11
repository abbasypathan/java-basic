package com.javabasic.iostreams;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		String s = "You are the creator of your destiny";
		StringTokenizer stringTokenizer = new StringTokenizer(s);

		while (stringTokenizer.hasMoreTokens()) {
			System.out.println(stringTokenizer.nextToken());
		}
	}
}
