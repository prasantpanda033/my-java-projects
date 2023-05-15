package com.biju.ser;

public class ReverseInt {

	public static void main(String[] args) {
		
		int num = 467;	
		
		while (num > 0) {
			System.out.print(num%10);
			num = num / 10; 
		}
	
	}

}
