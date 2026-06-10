package com.javabasic.codingexercises;

public class ReverseStringWord {

	public static void main(String[] args) {
		String str = "Java is awasome!!";

		String[] split = str.split(" ");
		int i = 0;
		String result = "";

		while (i < split.length) {
			String string = new StringBuffer(split[i]).reverse().toString() + " ";
			result += string;
			i++;
		}
		System.out.println(result.trim());
	}
}
