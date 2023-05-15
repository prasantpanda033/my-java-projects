package com.biju.multithread;

import java.util.List;

public class Task1 implements Runnable{
	
	List<Integer> l1;	
	
	public List<Integer> getL1() {
		return l1;
	}

	public void setL1(List<Integer> l1) {
		this.l1 = l1;
	}

	

	@Override
	public void run() {
		try {
			Thread.sleep(5000);
			for (int i = 0; i <= l1.size() - 1; i++) {
				l1.sort(null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
