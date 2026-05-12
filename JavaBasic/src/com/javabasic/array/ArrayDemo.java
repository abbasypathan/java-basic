package com.javabasic.array;

public class ArrayDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40, 50 };

		for (int i : arr1) {
			System.out.println(i);
		}

		int arr2[] = new int[5];
		arr2[0] = 10;
		arr2[1] = new Integer(20);
		arr2[2] = Integer.valueOf(30);

		for (int i : arr2) {
			System.out.println(i);
		}

		float[] arr3 = new float[4];

		for (float i : arr3) {
			System.out.println(i);
		}
	}
}
