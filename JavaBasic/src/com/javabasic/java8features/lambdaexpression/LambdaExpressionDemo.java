package com.javabasic.java8features.lambdaexpression;

public class LambdaExpressionDemo {

	public static void main(String[] args) {
		A functionInterface = () -> System.out.println("Functional Interface");
		functionInterface.method();
		functionInterface.method2();
		A.method3();

		SumOfInteger sunInterface = (x, y) -> {
			System.out.println("Addition of integers : " + (x + y));
		};
		sunInterface.sum(20, 30);
	}
}
