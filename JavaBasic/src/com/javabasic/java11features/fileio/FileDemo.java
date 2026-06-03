package com.javabasic.java11features.fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		Files.writeString(Path.of("data.txt"), "Hello Java 11");
		
		String data = Files.readString(Path.of("data.txt"));
		System.out.println(data);
	}
}
