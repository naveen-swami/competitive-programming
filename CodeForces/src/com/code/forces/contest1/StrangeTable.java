package com.code.forces.contest1;

import java.util.Scanner;

public class StrangeTable {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		while (testCase-- > 0) {

			long row = scanner.nextLong();
			long col = scanner.nextLong();
			long x = scanner.nextLong();

			long j = x % row == 0 ? x / row : x / row + 1;
			long i = x % row == 0 ? row : x % row;

		   long result = (i - 1) * col + j;

			System.out.println(result);
		}

	}

}
