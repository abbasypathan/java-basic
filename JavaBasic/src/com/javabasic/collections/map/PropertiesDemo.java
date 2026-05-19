package com.javabasic.collections.map;

import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {

		Properties prop = new Properties();
		

		prop.setProperty("username", "admin");
		prop.setProperty("password", "1234");
		prop.setProperty("url", "localhost");
		prop.put(102, "Test");

		System.out.println(prop);

		System.out.println(prop.getProperty("username"));
	}
}
