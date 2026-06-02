package com.javabasic.jvm;

import java.lang.reflect.Method;

public class ClassLoadTest {

	public static void main(String[] args) {
		try {
			Class<?> forName = Class.forName("com.javabasic.jvm.User");
			Method[] declaredMethods = forName.getDeclaredMethods();
			for (Method method : declaredMethods) {
				System.out.println(method.getName());
			}
			System.out.println(declaredMethods.length);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
