package com.javabasic.regex;

import java.util.regex.Pattern;

public class CharactersAndQuanitfiers {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[abc]", "a"));
		System.out.println(Pattern.matches("[abc]", "b"));
		System.out.println(Pattern.matches("[abc]", "d"));
		System.out.println(Pattern.matches("[abc]+", "a"));
		System.out.println();
		
		System.out.println(Pattern.matches("\\d", "2"));
		System.out.println(Pattern.matches("\\d", "a"));
		System.out.println(Pattern.matches("\\D", "2"));
		System.out.println(Pattern.matches("\\D", "a"));
		System.out.println();
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]{5}", "test"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{5}", "test1"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{2,5}", "test"));
		System.out.println();
	}
}
