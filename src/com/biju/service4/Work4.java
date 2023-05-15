package com.biju.service4;

import java.util.ArrayList;

public class Work4 {
	
	
	

	public static void main(String[] args) {
		
		String name = "mnbvbnm";
		StringBuilder sb = new StringBuilder(name);
		StringBuilder name2 = sb.reverse();
		String name3 = String.valueOf(name2);
		
		if(name.equals(name3)){
			System.out.println("String is Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
		
	}

}
