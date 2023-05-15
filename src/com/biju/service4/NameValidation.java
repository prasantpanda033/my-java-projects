package com.biju.service4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameValidation {
	
	
	public static final String v1 = "^[A-Za-z]{3,15}\\ [A-Za-z]{3,15}$";
	public static Pattern NV2 = Pattern.compile(v1);
	
	
	public static boolean verifiedName(String name) {
		Matcher matcher = NV2.matcher(name);
		return matcher.matches();
	}
	

	public static void main(String[] args) {
		
		
		boolean check = verifiedName("Prasanta panda");
		System.out.println(check);

	}

}
