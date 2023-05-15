package com.biju.service4;

import java.util.Arrays;
import java.util.List;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		
		Task task = new Task();
		
		
		Work1 work = new Work1(10, 0);
		Thread th = new Thread(work);
		
		Work2 work1 = new Work2("biju","ijbu", " ");
		Thread th1 = new Thread("work2");
		
		Work3 work3 = new Work3(456);
		Thread th2 = new Thread(th1);
		
		th.start();
		th1.start();
		th2.start();
		
		th.join();
		th1.join();
		th2.join();
		
		System.out.println(work.getNum());
		System.out.println(work1.getName());
		System.out.println(work3.getName());
		
	}

}
