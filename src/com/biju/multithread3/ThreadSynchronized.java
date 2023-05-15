package com.biju.multithread3;

import java.util.Date;

public class ThreadSynchronized {

	public static void main(String[] args) throws InterruptedException {
		
		Date start = new Date();		
		ThTask1 t1 = new ThTask1(5,1);
		Thread th1 = new Thread(t1);
		th1.start();


		Thread th2 = new Thread(t1);			
		th2.start();
		
		
		th1.join();
		th2.join();

		System.out.println(t1.getVal());
		
		
		System.out.println("Factorial is: " + t1.getNum());
		
		Date end = new Date();	
		System.out.println("time taken for all methods:" + String.valueOf(end.getTime()-start.getTime()));

	}

}
