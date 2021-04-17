package com.newton.school.web;

import java.util.Scanner;

import com.newton.school.service.NewtonSchoolFebContestService;

public class NewtonSchoolFebContestController {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		getInputWithTestCase1();
	}

	private static void getInputWithTestCase1() {
		// int testCase = scanner.nextInt();
		// while (testCase-- > 0) {
		int size = scanner.nextInt();
		// int k = scanner.nextInt();
		// int[] arr = new int[size];
		// for (int i = 0; i < size; i++) {
		// arr[i] = scanner.nextInt();
		// }

		System.out.println("My Ans: " +NewtonSchoolFebContestService.minSurfaceAreaOfCuboid(size));
		System.out.println("Original Ans: "+NewtonSchoolFebContestService.minSurfaceAreaOfCuboid2ndWay(size));

		// }
	}
}
