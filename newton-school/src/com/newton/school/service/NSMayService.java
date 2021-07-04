package com.newton.school.service;

import java.util.Arrays;

public class NSMayService {

	public static void getMinimumStrength(int size, int[] arr) {

		Arrays.sort(arr);
		int minimumStrength = Integer.MAX_VALUE;
		for (int i = 0; i < size; i = i + 2) {
			int diff = arr[i + 1] - arr[i];
			if (minimumStrength > diff) {
				minimumStrength = diff;
			}
		}
		System.out.println(minimumStrength);
	}

	public static int fibonacci(int num, int[] fibonacciArr) {

		for (int i = 3; i <= num; i++) {
			fibonacciArr[i] = fibonacciArr[i - 1] + fibonacciArr[i - 2];
		}
		return fibonacciArr[num];

	}
}
