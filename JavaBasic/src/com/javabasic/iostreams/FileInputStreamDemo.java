package com.javabasic.iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		FileInputStream fileInputStream = null;
		File file = new File("/Users/abbas/Abbas/Java/java-basic/JavaBasic/src/com/javabasic/iostreams/myfile.txt");
		try {
			fileInputStream = new FileInputStream(file);
			System.out.println("File Opened");
			int i;
			while ((i = fileInputStream.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("\nFile Closed");
		}
	}

}
