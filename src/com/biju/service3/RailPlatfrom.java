package com.biju.service3;

import java.util.Arrays;
import java.util.List;

public class RailPlatfrom {

	public static void main(String[] args) {

		List<Integer> arrival = Arrays.asList(100, 140, 150, 200, 215, 400);
		List<Integer> departure = Arrays.asList(110, 300, 220, 230, 315, 600);

		int num1 = arrival.size();
		int num2 = 0;
		int num3 = 0;

		arrival.sort(null);
		departure.sort(null);

		int i = 0;
		int j = 0;
		while (i < num1 && j < num1) {
			if (arrival.get(i) < departure.get(j)) {
				num2++;
				i++;
				if (num2 > num3)
					num3 = num2;
			} else {
				num2--;
				j++;

			}
		}
		
		System.out.println(num2);

	}

}
