package com.javabasic.java8features.methodreferancing;

public class MethodReferancingDemo {

	public static void main(String[] args) {
		MethodReferancingDemo referancingDemo = new MethodReferancingDemo();
		System.out.println(referancingDemo.displayMessage("Abbas"));

		MethodReferancingInterface referancingInterface = referancingDemo::displayMessage;
		System.out.println(referancingInterface.sayHello("Rahul"));
	}

	String displayMessage(String str) {
		return "Hello " + str;
	}
}
