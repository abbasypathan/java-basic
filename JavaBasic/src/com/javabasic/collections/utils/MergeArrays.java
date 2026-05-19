package com.javabasic.collections.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArrays {

	public static void main(String[] args) {
		String[] s1 = { "A", "B", "C" };
		String[] s2 = { "A", "B", "C" };

		List<String> list = new ArrayList<>(Arrays.asList(s1));
		list.addAll(Arrays.asList(s2));
		System.out.println(list);
	}
}
