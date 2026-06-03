package com.javabasic.java11features.string;

public class StringAPIUpdate {

	public static void main(String[] args) {
		String str = "   ";
		System.out.println(str.isBlank());

		String str1 = " Java ";
		System.out.println(str1.strip());

		String str2 = "-";
		System.out.println(str2.repeat(10));

		String text = """
				Java
				Spring
				Hibernate
				""";

		text.lines().forEach(System.out::println);
	}
}
