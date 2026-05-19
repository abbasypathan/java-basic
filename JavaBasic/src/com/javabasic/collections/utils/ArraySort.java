package com.javabasic.collections.utils;

import java.util.Arrays;
import java.util.List;

public class ArraySort {

	public static void main(String[] args) {
		int[] arr = { 30, 10, 20, 40, 60, 50 };
		for (int i : arr) {
			System.out.print(i + " ");
		}
		Arrays.sort(arr);
		System.out.println();
		for (int i : arr) {
			System.out.print(i + " ");
		}

		System.out.println();
		Integer[] array = { 30, 10, 20, 40, 60, 50 };
		List<Integer> asList = Arrays.asList(array);
		System.out.println(asList);
	}
}
