package com.biju.service4;

public class Work5 {

	public static void main(String[] args) {
		
		int num = 789232987;
		String num1 = String.valueOf(num);
		int num2 = 0;
		
		StringBuilder sb = new StringBuilder(num1);
		StringBuilder str = sb.reverse();
		String num3 = str.toString();
		int num4 = Integer.parseInt(num3);
		
		if(num == num4) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
