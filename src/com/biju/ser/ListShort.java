package com.biju.ser;

import java.util.Arrays;
import java.util.List;

public class ListShort {

	public static void main(String[] args) {
		
		List<String> names =Arrays.asList("lizard", "humans", "animals", "germs", "fish");
		System.out.println();
			names.sort(null);
			System.out.println(names);

	}

}
