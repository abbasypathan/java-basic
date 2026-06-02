package com.javabasic.reflection;

import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;

public class DiffrentWayOfObjectCreation {

	@SuppressWarnings({ "deprecation", "unused" })
	public static void main(String[] args) throws InstantiationException, IllegalAccessException,
			ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException,
			CloneNotSupportedException {

		Calculator c1 = new Calculator();

		Class.forName(Calculator.class.getName()).newInstance();// Deprecated

		Calculator c3 = Calculator.class.getConstructor().newInstance();

		Calculator c4 = (Calculator) c1.clone();

		DateFormat dateFormat = DateFormat.getInstance();
	}
}
