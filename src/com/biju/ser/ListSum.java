package com.biju.ser;

import java.util.Arrays;
import java.util.List;

public class ListSum {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(3,5,6,4,8,7);
		int sum = 0;
		for (int i=0; i<=nums.size()-1; i++) {
			 sum = sum+nums.get(i);
		}
		System.out.println(sum);

	}

}
