package com.biju.multithread3;

public class ThTask1 implements Runnable{
	
	private int l1;
	private int num;
	
	private int val;
	
	
	public int getL1() {
		return l1;
	}

	public void setL1(int l1) {
		this.l1 = l1;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
	

	public ThTask1(int l1, int num) {
		super();
		this.l1 = l1;
		this.num = num;
	}

	@Override
	public  void run() {
		
		callMethod();
		
	}

	private synchronized void callMethod() {
		try {
			for(int i=0;i<l1;i++) {
				System.out.println("from thread "+Thread.currentThread());
				Thread.sleep(200);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

}
