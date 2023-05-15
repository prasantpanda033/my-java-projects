package com.biju.service4;

import java.util.List;

public class Task {
	
	public int factroial(int num) {
		int num2 = 1;
		for(int i = 1; i <= num; i++)
		num2 = num2*i;
		return num2;
	}
	
	public int findMaxNum(List<Integer> l1) {
		int num;
		l1.sort(null);
		num = l1.get(l1.size()-1);
		return num;
	}
	
	public String palindrom(String name) {
		String name2 = "";
		String print;
		
		for(int i=0; i <= name.length()-1; i--) {
		name2 = name2 + name.charAt(name.length()-i);
		}
		if(name2 == name) {
			print = "String is palindrom";	
		} else {
			print = "not a palindrom";
		}
		return print;
		
	}

}
