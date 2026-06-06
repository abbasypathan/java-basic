package com.javabasic.java13and14features.patternmatching;

public class InstanceOfPatternMatchingDemo {

	public static void main(String[] args) {
		Object obj = getObject();
		// We can declared variable directly while checking instance type
		if (obj instanceof String str2) {
			String str = (String) obj;
			System.out.println(str);
			System.out.println(str2);
		}
	}

	public static Object getObject() {
		return "I'm the best";
	}
}
