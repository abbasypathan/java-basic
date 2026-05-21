package com.javabasic.collections.concurrent;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListWithThreadDemo extends Thread {

	static List<String> courses = new CopyOnWriteArrayList<>();

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		courses.add("React");// Another copy to add value
	}

	public static void main(String[] args) throws InterruptedException {
		
		CopyOnWriteArrayListWithThreadDemo arrayListWithThreadDemo = new CopyOnWriteArrayListWithThreadDemo();
		arrayListWithThreadDemo.start();

		courses.add("Java");
		courses.add("Paython");
		courses.add("AWS");
		courses.add("Docker");
		courses.add("K8");

		Iterator<String> iterator = courses.iterator();

		while (iterator.hasNext()) {
			Thread.sleep(2000);
			String next = iterator.next();
			System.out.println(next);
			if (next.equals("Docker")) {
				courses.add("Node"); // Another copy to add value
				courses.remove("Docker");
			}
		}
		//At the end it will merge all together
		System.out.println(courses);
	}
}
