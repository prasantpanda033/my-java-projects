package com.biju.service;

public class PhoneValidation {

	public static void main(String[] args) {

		String num = "7539015558";

		try {
			if (Integer.valueOf(num) != null) {
				System.out.println("valid phone number");
				
				
			}
		} catch (Exception e) {
			System.out.println("Entre a valid Phone Number");

		}

	}

}
