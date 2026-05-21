package com.javabasic.collections.concurrent;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo extends Thread {

	static Map<String, String> courses = new ConcurrentHashMap<>();

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		courses.put("React", "5.5");// Another copy to add value
	}

	public static void main(String[] args) throws InterruptedException {

		ConcurrentHashMapDemo concurrentHashMapDemo = new ConcurrentHashMapDemo();
		concurrentHashMapDemo.start();

		courses.put("Java", "6");
		courses.put("Paython", "3");
		courses.put("AWS", "4.4");
		courses.put("Docker", "5");
		courses.put("K8", "2");

		Iterator<String> iterator = courses.keySet().iterator();

		while (iterator.hasNext()) {
			Thread.sleep(2000);
			String next = iterator.next();
			System.out.println(next + " : " + courses.get(next));
		}
		// At the end it will merge all together
		System.out.println(courses);
	}
}
