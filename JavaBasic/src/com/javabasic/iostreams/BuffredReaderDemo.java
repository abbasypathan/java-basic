package com.javabasic.iostreams;

import java.io.BufferedReader;
import java.io.FileReader;

public class BuffredReaderDemo {

	public static void main(String[] args) throws Exception {
		FileReader fileReader = new FileReader(
				"/Users/abbas/Abbas/Java/java-basic/JavaBasic/src/com/javabasic/iostreams/myfile.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
		bufferedReader.close();
	}
}
