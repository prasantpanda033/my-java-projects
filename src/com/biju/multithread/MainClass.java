package com.biju.multithread;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		
		Date start = new Date();
		
		

		List<Integer> l1 = Arrays.asList(8, 5, 9, 3, 1, 6, 2, 4, 7);
		Task1 t1 = new Task1();
		t1.setL1(l1);
		Thread th1 = new Thread(t1);
		th1.start();
		Date m1 = new Date();		
		System.out.println("time taken m1:" + String.valueOf(m1.getTime()-start.getTime()));
		
		
		
		Task2 t2 = new Task2(46,31);
		Thread th2 = new Thread(t2);
		th2.start();
		Date m2 = new Date();		
		System.out.println("time taken till m2:" + String.valueOf(m2.getTime()-start.getTime()));
		
		
		
		Task3 t3 = new Task3("#", 5);	
		Thread th3 = new Thread(t3);
		th3.start();
		Date m3 = new Date();			
		
		
		
		th1.join();		
		th2.join();		
		th3.join();
		
		System.out.println("largest number is: " + t2.getNum());
		System.out.println("sorted list is: " + t1.getL1());
		System.out.println("The pattern is: " + t3.getStar());
		
		Date end = new Date();	
		System.out.println("time taken for all methods:" + String.valueOf(end.getTime()-start.getTime()));

	}

}
