package com.leet.code.contest.weekly.service;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class WeeklyContestService236 {

	public int findTheWinner(int n, int k) {
		if (k == 1 || n == 1) {
			return n;
		}
		//int winner = 0;

		List<Integer> friendList = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			friendList.add(i);
		}
//		friendList.add(friendList.get(0));

		for (int i = k-1; friendList.size() != 1; i = (i + k -1) % friendList.size()) {
			// if (friendList.size() == 1) {
			// return friendList.get(0);
			// }

			friendList.remove(i);

		}

		return friendList.get(0);
	}

	public int arraySign(int[] nums) {

		long product = 1;
		int mod = 1000000007;
		for (int element : nums) {
			product = (product * element) % mod;
		}
		if (product > 0) {
			return 1;
		} else if (product < 0) {
			return -1;
		} else {
			return 0;
		}
	}
}
