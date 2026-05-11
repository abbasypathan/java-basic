package com.javabasic.iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		File fileInput = new File(
				"/Users/abbas/Abbas/Java/java-basic/JavaBasic/src/com/javabasic/iostreams/myfile.txt");
		File fileOutput = new File(
				"/Users/abbas/Abbas/Java/java-basic/JavaBasic/src/com/javabasic/iostreams/myfileOutput.txt");
		try {
			fileInputStream = new FileInputStream(fileInput);
			fileOutputStream = new FileOutputStream(fileOutput);
			System.out.println("File Opened");
			int i;
			while ((i = fileInputStream.read()) != -1) {
				fileOutputStream.write(i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileInputStream.close();
				fileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("\nFile Closed");
		}
	}
}
