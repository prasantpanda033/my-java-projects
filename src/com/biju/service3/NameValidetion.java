package com.biju.service3;

import java.util.regex.Pattern;

public class NameValidetion {

	public static void main(String[] args) {

		String word = "Prasanta033";

		if (word != null) {
			if (word.length() >= 8 && word.length() <= 30) {
				System.out.println("Name is valid");
			}
			if ((Pattern.matches("[a-zA-Z0-9]", word))) {
				System.out.println("Name is valid");
			} else {
				System.out.println("Enter a valid name");
			}

		}

	}
}
