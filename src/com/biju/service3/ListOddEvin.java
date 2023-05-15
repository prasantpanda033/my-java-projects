package com.biju.service3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOddEvin {

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer> l2 = new ArrayList<>();
	
		for (int i:l1) {
			if (l1.get(i-1) % 2 == 0) {
				l2.add(l1.get(i-1));

			}
		}
		for (int j:l1) {
			if (l1.get(j-1) % 2 != 0) {
				l2.add(l1.get(j-1));
			}
		}
		System.out.println(l2);
	}

}
