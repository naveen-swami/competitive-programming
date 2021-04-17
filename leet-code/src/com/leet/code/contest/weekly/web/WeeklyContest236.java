package com.leet.code.contest.weekly.web;

import java.util.Scanner;

import com.leet.code.contest.weekly.service.WeeklyContestService236;

public class WeeklyContest236 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int i = 5;
		int k = 2;
		System.out.println(new WeeklyContestService236().findTheWinner(i, k));
	}
}
