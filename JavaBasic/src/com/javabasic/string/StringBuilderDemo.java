package com.javabasic.string;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();

		System.out.println("Initial capacity : " + stringBuilder.capacity());

		stringBuilder.append("All the power within you");
		stringBuilder.append("more sting to increase capacity");

		System.out.println(stringBuilder);

		System.out.println("Initial capacity : " + stringBuilder.capacity());
	}
}
