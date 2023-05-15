package com.biju.ser;

public class Fibo {

	public static void main(String[] args) {
		int num1 = 0, num2 =1, num3;
		
		System.out.print(num1 + " " + num2 + " ");
		
		for (int i=1; i<=10; i++) {
			num3 = num2;
			num2 = num1 + num2;
			System.out.print(num2 + " ");
			num1 = num3;
		}

	}

}
