package com.biju.service;

public class NumReverce {

	public static void main(String[] args) {
		
		int num = 987654321;
		
		while(num>0) {
			System.out.print(num%10);
			num = num/10;
		}
		
		StringBuilder sb = new StringBuilder(num);
		StringBuilder sb2 = sb.reverse();
		System.out.println(sb2);
	}

}
