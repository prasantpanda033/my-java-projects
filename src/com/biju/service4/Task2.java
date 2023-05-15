package com.biju.service4;

public class Task2 {

	public static void main(String[] args) {

		String name = "biju";
		String name2 = "ujia";
		String name3 = "";

		if (name.length() != name2.length()) {
			System.out.println("not a Anagram");
		} else {

			for (int i = 0; i <= name.length() - 1; i++) {
				char a = name.charAt(i);

				for (int j = 0; j <= name2.length() - 1; j++) {
					char b = name.charAt(j);

					if (a == b) {
						name3 = name3 + a;
						break;

					}
				}
			}
			if (name.equals(name3)) {
				System.out.println("Anagram");
			} else {
				System.out.println("not a Anagram");
			}
		}
	}

}
