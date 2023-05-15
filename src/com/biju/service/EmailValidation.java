package com.biju.service;

public class EmailValidation {

	public static void main(String[] args) {
		
		String email = "Prasantpanda@gmail.com";
		
		if (email.contains("@")) {
			if(email.contains(" ")) {
				System.out.println("Enter a valid Email");
			}
			String email2 = email.toLowerCase();
		} else {
			System.out.println("Enter a valid Email");
		}

	}

}
