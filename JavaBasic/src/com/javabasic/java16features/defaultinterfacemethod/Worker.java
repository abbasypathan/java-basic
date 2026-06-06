package com.javabasic.java16features.defaultinterfacemethod;

public interface Worker {

	default String work() {
		return "Done";
	}
}
