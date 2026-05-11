package com.javabasic.innerclasses.nonstaticinnerclass;

public class AccessingOuterClassMember {

	private static int x = 50;
	private int y;

	AccessingOuterClassMember(int y) {
		this.y = y;
	}

	void f1() {
		System.out.println("Non-Static Outer class with non-static method");
	}

	class Inner {

		private int y;

		Inner(int y) {
			this.y = y;
		}

		void f2() {
			System.out.println("Accesing outer static member " + AccessingOuterClassMember.x);
			System.out.println("Accesing outer non-static member " + AccessingOuterClassMember.this.y);
			System.out.println("Accesing inner non-static member " + this.y);
		}

		static void f3() {
			System.out.println("Non-Static Inner class with static method");
		}
	}

	public static void main(String[] args) {
		AccessingOuterClassMember outer = new AccessingOuterClassMember(80);
		outer.f1();
		AccessingOuterClassMember.Inner inner = outer.new Inner(90);
		inner.f2();
		AccessingOuterClassMember.Inner.f3();
	}
}
