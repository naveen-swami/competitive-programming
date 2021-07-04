package com.newton.school.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.newton.school.service.NSMarchService;
import com.newton.school.service.NSMayService;

public class NSMayController {
	static Scanner scanner = new Scanner(System.in);
	static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
//		takeInput();
		int size = scanner.nextInt();
		int[] arr = oneDArray(size);
		NSMayService.getMinimumStrength(size, arr);
	}

	public static void takeInput() {
		int size = scanner.nextInt();
//		int x = scanner.nextInt();
//		int[] arr = oneDArray(size);
//		int[] fibonacciArr = new int[1000000];
//		fibonacciArr[1] = 0;
//		fibonacciArr[2] = 1;
//		System.out.println(NSMayService.fibonacci(size, fibonacciArr) % 2 != 0 ? "Alive" : "Dead");

//		System.out.println(NSMarchService.chamberOfSecrets(arr, x));
//	    NSMarchService.whoHasCreatedMoreDamage(arr, size);
//		int[][] arr = twoDArray(size, 3);
	}

	public static int[][] twoDArray(int row, int col) {
		int[][] arr = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}

		return arr;
	}

	public static void takeTestCaseWithBufferedReader() throws IOException {
		int testCase = Integer.parseInt(bReader.readLine());
		while (testCase-- > 0) {
			int size = Integer.parseInt(bReader.readLine());
			int[] arr = getArrayUsingBufferedReader(size);
		}
	}

	public static int[] getArrayUsingBufferedReader(int size) throws IOException {
		int[] arr = new int[size];
		String[] line = bReader.readLine().split(" ");
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(line[i]);
		}
		return arr;
	}

	public static void takeTestCase() {
		int testCase = scanner.nextInt();
		while (testCase-- > 0) {

			int size = scanner.nextInt();
			int[] arr = oneDArray(size);
		}
	}

	public static int[] oneDArray(int size) {
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}
		return arr;
	}

}
