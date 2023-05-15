package com.biju.service;

public class SubString {

	public static void main(String[] args) {
		String word = "cuttack";
		String word2 = "";

		try {
			for (int i = 0; i < word.length(); i++) {

				for (int j = 0; j <= word.length(); j++) {

					System.out.println(word.substring(i, j));

				}
			}
		} catch (Exception e) {

		}

	}

}
