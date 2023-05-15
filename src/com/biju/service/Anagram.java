package com.biju.service;

public class Anagram {

	public static void main(String[] args) {

		String word = "praaanta";
		String word2 = "aspanrat";
		String word3 = "";

		if (word.length() != word2.length()) {
			System.out.println("Not a Anagram");
		} else {
			for (int i = 0; i <= word.length() - 1; i++) {
				char a = word.charAt(i);
				

				for (int j = 0; j <= word2.length() - 1; j++) {
					char b = word2.charAt(j);
					if (a == b) {
						word3 = word3 + b;
						break;
					}
				}
			}
			if (word.equals(word3)) {
				System.out.println("Anagram");

			} else {
				System.out.println("Not a Anagram");

			}
		}
	}

}
