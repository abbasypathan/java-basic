package com.javabasic.collections.utils;

import java.util.Arrays;
import java.util.Collections;

public class MinAndMax {

	public static void main(String[] args) {
		Integer[] numers = { 20, -30, 25, 60, 99 };
		Integer min = Collections.min(Arrays.asList(numers));
		Integer max = Collections.max(Arrays.asList(numers));
		System.out.println(min);
		System.out.println(max);
	}
}
