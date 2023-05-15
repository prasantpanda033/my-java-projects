package com.biju.service;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 17;
		int i = 2;
		int num3 = 0;

		while (i < num) {
			if (num % i == 0) {
				num3++;
			}
			i++;
		}
		if (num3 > 2) {
			System.out.println("Not a prime number");
		} else {
			System.out.println("prime number");
		}

	}

}
