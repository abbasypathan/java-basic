package com.javabasic.generics;

import java.util.ArrayList;

public class WildCardParam {

	public void method1(ArrayList<?> list) {
		list.add(null);
		// list.add("Abbas"); Type is not specified, it will allow only null value
	}

	public void method2(ArrayList<? extends Thread> list) {
		list.add(null);
		// list.add("Abbas"); String not extends Thread, Class which extends by Thread only allowed
	}

	public void method3(ArrayList<? super Object> list) {
		list.add(null);
		list.add("Abbas");
	}

	public static void main(String[] args) {
		WildCardParam wildCardParam = new WildCardParam();
		wildCardParam.method1(new ArrayList<String>());
		wildCardParam.method2(new ArrayList<Thread>());
		wildCardParam.method3(new ArrayList<Object>());
	}
}
