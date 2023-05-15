package com.biju.service;

public class SwipeNumber {

	public static void main(String[] args) {
		int num1 = 345;
		int num2 = 789;
		
		num1 = num1+num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		 
		System.out.println(num1);
		System.out.println(num2);

	}

}
