package com.javabasic.innerclasses.staticinnerclass;

public class Outer {

	static void f1() {
		System.out.println("Outer static method");
	}

	static class Inner {

		static void f2() {
			System.out.println("Inner static method");
		}

		void f3() {
			System.out.println("Inner non-static method");
		}
	}

	public static void main(String[] args) {
		Outer.f1();
		Inner.f2();
		Outer.Inner.f2();

		Inner inner = new Inner();
		inner.f3();

		Outer.Inner inner2 = new Outer.Inner();
		inner2.f3();
	}
}
