package com.biju.service;

import java.util.Arrays;
import java.util.List;

public class MissingNum {

	public static void main(String[] args) {
		
		List<Integer> l1 = Arrays.asList(1,2,3,4,5,6,7);
		
		int num = 0;
		int num2 = l1.size()+1;
		int num3 = num2*(num2+1)/2;
		int num4 = 0;
		
		for(int i=0; i <= l1.size()-1; i++) {
			num = num + l1.get(i);
	
		}
		num4 = num2-num;
		System.out.println(num4);
	}

}
