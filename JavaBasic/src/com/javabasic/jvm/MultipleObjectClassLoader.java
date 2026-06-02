package com.javabasic.jvm;

public class MultipleObjectClassLoader {

	public static void main(String[] args) {
		User u1 = new User();
		Class<? extends User> c1 = u1.getClass();

		User u2 = new User();
		Class<? extends User> c2 = u1.getClass();

		// Class gets loaded into memory 1 time only
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1 == c2);

		System.out.println(c1.getClassLoader());
		System.out.println(String.class.getClassLoader());

		// Object gets created multiple
		System.out.println(u1.hashCode());
		System.out.println(u2.hashCode());
	}
}
