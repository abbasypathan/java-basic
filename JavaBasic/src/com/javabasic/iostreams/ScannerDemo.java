package com.javabasic.iostreams;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter student id, name, score");
		int id = scanner.nextInt();
		String name = scanner.next();
		double score = scanner.nextDouble();
		System.out.println(id);
		System.out.println(name);
		System.out.println(score);
		scanner.close();
	}
}
