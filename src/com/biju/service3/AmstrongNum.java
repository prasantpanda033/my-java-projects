package com.biju.service3;

import java.util.ArrayList;
import java.util.List;

public class AmstrongNum {

	public static void main(String[] args) {
		int num1 = 8208;
		int num = num1;
		int num2 = 0;
		int num3 = 0;
		int num4 = String.valueOf(num1).length();
		
		while(num>0) {
			num2 = num % 10;
			num3 = (int) (num3 + Math.pow(num2,num4 ));
			num = num/10;
			
			
		}
		if(num1 == num3) {
		System.out.println("It is a Amstrong number");
		}else {
			System.out.println("Not");
		}

	}

}
