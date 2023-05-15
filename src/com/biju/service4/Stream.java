package com.biju.service4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(6,2,4,9,1,7,5,28,43,57,16,34);
		
		List<Integer> newList = myList.stream().filter(x -> x >= 1).collect(Collectors.toList());
				
		
		System.out.println(newList);

	}

}
