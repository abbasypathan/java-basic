package com.javabasic.innerclasses.nonstaticinnerclass;

public class Outer {

	void f1() {
		System.out.println("Non-Static Outer class with non-static method");
	}

	class Inner {

		void f2() {
			System.out.println("Non-Static Inner class with non-static method");
		}

		static void f3() {
			System.out.println("Non-Static Inner class with static method");
		}
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.f1();
		Outer.Inner inner = outer.new Inner();
		inner.f2();
		Outer.Inner.f3();
	}
}
