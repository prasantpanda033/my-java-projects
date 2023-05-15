package com.biju.ser;

public class Task3 {

	public static void main(String[] args) {
		String name2 = "";
		String print;
		String name = "asa"; 
		
		for(int i=name.length()-1; i >= 0; i--) {
		name2 = name2 + name.charAt(i);
		}
		
		if(name2.equals(name)) {
			print = "String is palindrom";	
		} else {
			print = "not a palindrom";
		}
		System.out.println(print);

	}

}
