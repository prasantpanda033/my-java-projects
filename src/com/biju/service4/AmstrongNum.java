package com.biju.service4;

public class AmstrongNum {

	public static void main(String[] args) {
		int num = 912985153;
		int num1 = num;
		int num2;
		int num3 = 0;
		int num4 = String.valueOf(num1).length();
		
		while(num > 0) {
			num2 = num % 10;
			num3 = (int) (num3 + Math.pow(num2,num4 ));
			num = num/10;
		}
		if(num1 == num3) {
			System.out.println("number is Amstrong");
		}else {
			System.out.println("not a Amstrong number");
		}
	}

}
