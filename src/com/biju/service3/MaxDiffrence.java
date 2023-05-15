package com.biju.service3;

import java.util.Arrays;
import java.util.List;

public class MaxDiffrence {

	public static void main(String[] args) {
		
		List<Integer> l1 = Arrays.asList(7,5,3,8,2,9,4,6);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		l1.sort(null);
		
			num1 = l1.get(l1.size()-1);
			num2 = l1.get(l1.size()-1-(l1.size()-1));
			num3 = num1-num2;
	
			System.out.println(num2);
			
		
	}

}
