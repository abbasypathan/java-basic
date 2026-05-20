package com.javabasic.generics;

public class MyGenericClass<T> {

	T obj;

	MyGenericClass(T obj) {
		this.obj = obj;
	}

	public void displayObject() {
		System.out.println(this.obj.getClass().getName());
	}

	public T getObject() {
		return this.obj;
	}

	public static void main(String[] args) {
		// It will consider the type which we pass in type erasure <String>
		MyGenericClass<String> string = new MyGenericClass<>("Abbas");
		string.displayObject();
		System.out.println(string.getObject());

		MyGenericClass<Integer> integer = new MyGenericClass<>(20);
		integer.displayObject();
		System.out.println(integer.getObject());
	}
}
