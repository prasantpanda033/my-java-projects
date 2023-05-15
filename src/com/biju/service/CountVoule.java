package com.biju.service;

public class CountVoule {

	public static void main(String[] args) {

		String word = "prasanta";

		char letter = 'a';
		int count = 0;

		for (int i = 0; i <= word.length() - 1; i++) {
			letter = word.charAt(i);
			if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
				count++;
			}

		}
		
		System.out.println(count);
	}
}
