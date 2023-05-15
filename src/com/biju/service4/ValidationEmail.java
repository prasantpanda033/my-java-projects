package com.biju.service4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationEmail {

	public static final Pattern VALID_EMAIL = Pattern.compile("^[A-Z0-9._]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	public static boolean validate(String email) {
		Matcher matcher = VALID_EMAIL.matcher(email);
		return matcher.matches();

	}

	
	
	public static void main(String[] args) {
		boolean check = validate("prasant123@gmail.com");
		System.out.println(check);
	}

}
