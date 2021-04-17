package com.leet.code.contest.weekly.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class WeeklyContest235Service {

	public int[] findingUsersActiveMinutes(int[][] logs, int k) {
		int[] res = new int[k];

		Map<Integer, Set<Integer>> mp = new HashMap<>();

		for (int[] val : logs) {
			int id = val[0];
			int min = val[1];

			if (mp.containsKey(id)) {
				Set<Integer> uam = mp.get(id);
				uam.add(min);
				mp.put(id, uam);
			} else {
				Set<Integer> uam = new HashSet<>();
				uam.add(min);
				mp.put(id, uam);
			}
		}

		Map<Integer, Integer> resMap = new HashMap<>();
		for (Map.Entry<Integer, Set<Integer>> entry : mp.entrySet()) {
			int size = entry.getValue().size();
			resMap.put(size, resMap.getOrDefault(size, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : resMap.entrySet()) {
			res[entry.getKey() -1] = entry.getValue();
		}

		return res;
	}

	public String truncateSentence(String s, int k) {
		String[] str = s.split(" ");
		String newStr = "";
		for (int i = 0; i < k; i++) {
			if (i == k - 1) {
				newStr += str[i];
				break;
			}
			newStr += str[i] + " ";
		}
		return newStr;
	}
}
