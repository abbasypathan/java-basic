package com.javabasic.java8features.methodreferancing.constructorreferancing;

public class ConstructorReferancingDemo {

	private String s;

	ConstructorReferancingDemo(String str) {
		this.s = str;
		System.out.println("Inside constructor : " + this.s);
	}

	public static void main(String[] args) {
		ConstructorReferancingInterface constructorReferancingInterface = ConstructorReferancingDemo::new;
		constructorReferancingInterface.get("Abbas");
	}
}
