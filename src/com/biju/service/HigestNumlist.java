package com.biju.service;

import java.util.Arrays;
import java.util.List;

public class HigestNumlist {

	public static void main(String[] args) {
		
		List<Integer> l1 =Arrays.asList(8,6,4,9,7,1);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		for(int i=0; i <= l1.size()-1; i++) {
			num3 = num2;
			num2 = l1.get(i);
			//System.out.println(num2);
			num1 = num3;
			if(num3 < num2) {
				num4 = num3;
			} else {
				num4 = num3;
			}			
		}
		System.out.println(num4);
	}

}
