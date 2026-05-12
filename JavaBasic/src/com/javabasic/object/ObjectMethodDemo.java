package com.javabasic.object;

public class ObjectMethodDemo {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setFirstName("Abbas");
		employee.setLastName("Pathan");

		System.out.println(employee);
		System.out.println(employee.hashCode());

		Employee employee1 = new Employee();
		employee1.setFirstName("Abbas");
		employee1.setLastName("Pathan");

		System.out.println(employee.equals(employee1));
	}
}
