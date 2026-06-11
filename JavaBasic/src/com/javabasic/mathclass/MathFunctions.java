package com.javabasic.mathclass;

public class MathFunctions {

	public static void main(String[] args) {
		int n1 = 16;
		int n2 = 2;

		System.out.println("Max of two number : " + Math.max(n1, n2));
		System.out.println("Min of two number : " + Math.min(n1, n2));

		System.out.println("Sqr of two number : " + Math.sqrt(n1));

		System.out.println("Power of two number : " + Math.pow(n2, n1));

		System.out.println("Mult of two number : " + Math.multiplyExact(n1, n2));
	}
}
