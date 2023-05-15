package com.biju.service3;

import java.util.Arrays;
import java.util.List;

public class Listmax {

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(6,4,8,1,9,3,7,5,2);
		
		l1.sort(null);
		int num1 = l1.get(l1.size()-1);
		int num2 = l1.get(l1.size()-2);
		
		int num3 = l1.get(l1.size() - (l1.size()));
		int num4 = l1.get(l1.size() - (l1.size()-1));
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
	}

}
