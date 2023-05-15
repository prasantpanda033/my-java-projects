package com.biju.service;

public class CountDigits {

	public static void main(String[] args) {
		
		int num = 9087658;
		int num2 = 0;
		while(num>0) {
			num = num/10;
			num2++;		
		}
		System.out.println(num2);

	}

}
