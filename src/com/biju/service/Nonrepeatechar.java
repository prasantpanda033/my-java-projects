package com.biju.service;

import java.util.Arrays;

public class Nonrepeatechar {

	public static void main(String[] args) {
		String word1 = "biju";
		String word2 = "ikmnoj";
		int num1 = word1.length();
		int num2 = word2.length();
		int num3 = 0;

		String word = "";

		char[] arr1 = word1.toCharArray();
		char[] arr2 = word2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		String a = "";
		String b = "";
		

		for (int i = 0; i < num1; i++) {
			 a =a + arr1[i];
			for (int j = 0; j < num2; j++) {
				 b =b + arr2[i];
				if (a.equalsIgnoreCase(b)) {
					System.out.print(a);
				}else {
					System.out.println(b);
				}
			}
		}
		System.out.println(word);
	}

}
