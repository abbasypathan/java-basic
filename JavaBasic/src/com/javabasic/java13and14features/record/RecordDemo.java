package com.javabasic.java13and14features.record;

public class RecordDemo {

	public static void main(String[] args) {

		Employee employee = new Employee("Abbas", 123);
		System.out.println(employee.toString());
		System.out.println(employee.sal());
		System.out.println(employee.name());
	}
}
