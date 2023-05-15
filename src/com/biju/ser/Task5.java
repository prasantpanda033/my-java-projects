package com.biju.ser;

public class Task5 {

	public static void main(String[] args) {
		String email = "Prasantpanda@gmail.com";
		if (email.contains("@")) {
			String email2 = email.toLowerCase();
			System.out.println(email2);
		} else {
			System.out.println("Enter a valid Email");
		}
	}

}
