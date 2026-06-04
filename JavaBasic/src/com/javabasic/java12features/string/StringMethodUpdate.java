package com.javabasic.java12features.string;

public class StringMethodUpdate {

	public static void main(String[] args) {
		String str = "  All the best";
		System.out.println(str);

		//Add space starting of the string, if negative it will remove spaces
		System.out.println(str.indent(2));
		System.out.println(str.indent(-3));

		//Accepts function and take selected string as input
		String str1 = "10";
		System.out.println(str1.transform(Integer::parseInt));
	}
}
