package com.biju.ser;

import java.util.Arrays;
import java.util.List;

public class FindLargNum {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(4, 6, 2, 3, 1, 5);
		nums.sort(null);
		System.out.println(nums.get(nums.size()-1));

	}

}
