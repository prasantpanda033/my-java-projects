package com.biju.multithread2;

import java.util.Date;

public class MainClass { 

	public static void main(String[] args)  throws InterruptedException {

		Date start = new Date();

		ThreadTask1 tt1 = new ThreadTask1("prasanta",'a',0 );
		Thread th1 = new Thread(tt1);
		th1.start();
		Date d1 = new Date();
		
		
		
		ThreadTask2 tt2 = new ThreadTask2(10,0,1,0);
		Thread th2 = new Thread(tt2);
		th2.start();
		Date d2 = new Date();
		
		
		
		ThreadTask3 tt3 = new ThreadTask3(57);
		Thread th3 = new Thread(tt3);
		th3.start();
		Date d3 = new Date();
		
		
		th1.join();
		th2.join();
		th3.join();
		
		
		System.out.println("Number of voule present in string: " + tt1.getCount());
		System.out.println("Time taken: " + String.valueOf(d1.getTime() - start.getTime()));
		
		
		System.out.print("Fibonacci series is: " + tt2.getNum4());
		System.out.println("Time taken: " + String.valueOf(d2.getTime() - start.getTime()));
		
		th3.join();
		Date end = new Date();
		System.out.println(tt3.getR());
		System.out.println("time taken: " + String.valueOf(end.getTime() - start.getTime()));

	}

}
