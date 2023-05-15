package com.biju.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeparetionLise {

	public static void main(String[] args) {

		List<Integer> l1 = Arrays.asList(1, 0, 1, 0, 1, 0, 1, 0);
		List<Integer> l2 = new ArrayList();
		int num1 = 0;
		int num2 = 0;

		try {
			for (int i = 0; i <= l1.size() - 1; i++) {
				if (l1.get(i) == 0) {
					num1++;
				} else {
					num2++;
				}
			}

			for (int j = 1; j <= num1; j++) {

				l2.add(0);

			}

			for (int k = 1; k <= num2; k++) {
				l2.add(1);
			}
		} catch (Exception e) {
			System.out.println("earror while add in list " + e);

		}

		System.out.println(l2);

	}

}
