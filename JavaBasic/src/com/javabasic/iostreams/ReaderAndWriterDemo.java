package com.javabasic.iostreams;

import java.io.FileReader;
import java.io.FileWriter;

public class ReaderAndWriterDemo {

	public static void main(String[] args) throws Exception {
		FileReader fileReader = null;
		FileWriter fileWriter = null;

		fileReader = new FileReader(
				"/Users/abbas/Abbas/Java/java-basic/JavaBasic/src/com/javabasic/iostreams/myfile.txt");
		fileWriter = new FileWriter(
				"/Users/abbas/Abbas/Java/java-basic/JavaBasic/src/com/javabasic/iostreams/myfileOutput1.txt");

		int ch;

		while ((ch = fileReader.read()) != -1) {
			fileWriter.write(ch);
		}
		fileReader.close();
		fileWriter.close();
	}
}
