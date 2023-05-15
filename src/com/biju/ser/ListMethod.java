package com.biju.ser;

import java.util.Arrays;
import java.util.List;

public class ListMethod {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5);
		
		nums.add(7);
		System.out.println(nums);
		nums.add(3, 9);
		System.out.println(nums);
		nums.clear();
		System.out.println(nums);
		
	}

}
