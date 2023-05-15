package com.biju.ser;

import java.util.Arrays;
import java.util.List;

public class ListCheck {

	public static void main(String[] args) {

		List<String > items = Arrays.asList("cat","dog","parrot","mouse","rabbit");
		
		String item ="cat";
			if(items.contains(item)) {
				System.out.println("pass");
			}else {
				System.out.println("fail");
		}
	}

}
