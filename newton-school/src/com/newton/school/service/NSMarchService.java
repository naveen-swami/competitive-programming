package com.newton.school.service;

public class NSMarchService {
	
	public static int chamberOfSecrets(int[] arr,int x) {
		
		
		int  left = 1;
		int right = x;
		int mod = 1000000007;
		while(left < right) {
			int mid = left + (right - left) /2;
			long inialPosition = mid;
			for(long el : arr) {
				inialPosition = (inialPosition * el) % mod;
			}
			if(inialPosition == x) {
				return mid;
			} else if(inialPosition > x) {
				right = mid -1;
			} else {
				left = mid+1;
			}
		}
//		
//		
//		for(int i = arr.length -1; i >= 0; i--) {
//			x /= arr[i];
//		}
		
		return left;
	}
	
	public static void whoHasCreatedMoreDamage(int[] arr, int size) {
		int damageByProf = 0;
		int damageByHarry = 0;
		for(int i = 0; i < size; i++) {
			if(i % 2 == 0) {
				damageByProf += arr[i];
			} else {
				damageByHarry += arr[i];
			}
		}
		System.out.println(damageByProf < damageByHarry ? "Harry" : "Professor");
	}

}
