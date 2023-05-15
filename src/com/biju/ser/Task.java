package com.biju.ser;

public class Task {

	public static void main(String[] args) {
		int num1 = 123;
		int num2 = 456;
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println(num1);
		System.out.println(num2);
	
	}

}
