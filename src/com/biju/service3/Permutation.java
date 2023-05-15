package com.biju.service3;

public class Permutation {
	

	public static void main(String[] args) {
		String name = "ABC";
		String name2 = "";
		String name3 = "";
		
		
		for(int i=0; i <= name.length()-1; i++ ) {
			name2 = name2 + name.charAt(i);
			for(int j=1; j <+ name.length()-1; j++) {
				name3 = name2 + name.charAt(j);
				System.out.println(name3);
			}
		}
	}

}
