package com.biju.ser;

public class Task6 {

	public static void main(String[] args) {
		
		int num = 0;
		int num1 = 1;
		int num2 = 10;
		System.out.println(num);
		System.out.println(num1);
		
		for(int i=1; i<=num2; i++) {
			int num3 = num1;
			num1 = num1+num;
			System.out.println(num1);
			num = num3;
		}
	}

}
