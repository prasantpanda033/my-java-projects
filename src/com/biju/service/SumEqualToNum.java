package com.biju.service;

import java.util.Arrays;
import java.util.List;

public class SumEqualToNum {

	public static void main(String[] args) {
		
		List<Integer> l1 = Arrays.asList(1,2,3,4,5,6);
		int num1 = 10;
		int num2 = 0;
		int num3 = 0;
		int num4 =0;
		
		for(int i=0; i <= l1.size()-1; i++ ) {
			num2 = l1.get(i);
			
			for(int j=0; j <= l1.size()-1; j++) {
				num3 = l1.get(j);
				if(num2+num3 == num1) {
					System.out.println(num2);
					System.out.println(num3);
				}
				
			}
			
		}

	}

}
