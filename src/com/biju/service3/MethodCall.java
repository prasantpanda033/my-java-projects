package com.biju.service3;

import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class MethodCall {

	public List<Integer> shortList(List<Integer> l1) {
		try {
			Thread.sleep(5000);
			for (int i = 0; i <= l1.size() - 1; i++) {
				l1.sort(null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return l1;
	}
	

	int num = 0 ;
	public int maxInt(int x, int y) {
		
		try {
			Thread.sleep(8000);
			if (x < y) {
				num = y;
			} else {
				num = x;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;	
	}
	
	String star = "";
	public String printStar(int x) {
		try {
			Thread.sleep(6000);
			for(int i=0; i<x; i++) {
				  star = star + "*";
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return star;

		
	}

	public static void main(String[] args) {
		MethodCall method = new MethodCall();
		
		Date start = new Date();

		List<Integer> l1 = Arrays.asList(8, 5, 9, 3, 1, 6, 2, 4, 7);
		List<Integer> n = method.shortList(l1);
		System.out.println(n);
		Date m1 = new Date();		
		System.out.println("time taken m1:" + String.valueOf(start.getTime()-m1.getTime()));
		
		int no = method.maxInt(46,31);
		System.out.println(no);
		Date m2 = new Date();		
		System.out.println("time taken till m2:" + String.valueOf(start.getTime()-m2.getTime()));
		
		 String pr = method.printStar(5);
		System.out.println(pr);
		Date m3 = new Date();		
		System.out.println("time taken for all methods:" + String.valueOf(start.getTime()-m3.getTime()));
	}

}
