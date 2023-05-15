package com.biju.service4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationPhoneNo {
	
	public static final String x = "^[0-9{1,3}]+\\-[0-9]{8,10}$";

	
	public static Pattern VERIFY_PHONE_NO = Pattern.compile(x);
	
	public static boolean verifyPhoneNo(String phoneNo) {
		Matcher matcher = VERIFY_PHONE_NO.matcher(phoneNo);
		return matcher.matches();	
		
	}
	
	

	public static void main(String[] args) {
		boolean y = verifyPhoneNo("91-25896321");
		System.out.println(y);
	}

}
