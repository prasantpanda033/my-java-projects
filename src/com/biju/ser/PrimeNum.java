package com.biju.ser;

public class PrimeNum {

	public static void main(String[] args) {

		int num = 7;
		int num2 = 0;

		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				num2++;
			}
		}
		if (num2 > 2) {
			System.out.println("Not a Prime Number");
		} else {
			System.out.println("Prime Number");
		}
	}

}
