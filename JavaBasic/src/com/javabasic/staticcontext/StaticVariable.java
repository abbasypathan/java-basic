package com.javabasic.staticcontext;

public class StaticVariable {

	public static int staticNum;

	public static void main(String[] args) {
		System.out.println("Inside main method : " + StaticVariable.staticNum);
	}
}
/*
OUTPUT :
Inside main method : 0
*/