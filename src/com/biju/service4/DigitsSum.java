package com.biju.service4;

public class DigitsSum {

	public static void main(String[] args) {
		int num = 71234;
		int num2 = 0;
		int num3 = 0;
		
		
		while(num > 0 ) {
			num2 = num % 10;
			num3 = num3 + num2;
			num = num / 10;
		}
		System.out.println(num3);

	}

}
