package com.biju.multithread2;

public class ThreadTask3 implements Runnable {

	private int num;
	private String r;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getR() {
		return r;
	}

	public void setR(String r) {
		this.r = r;
	}

	
	public ThreadTask3(int num) {
		super();
		this.num = num;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(6000);
			int num2 = 0;
			for (int i = 2; i <= num; i++) {
				if (num % i == 0) {
					num2++;
				}
			}
			if (num2 > 2) {
				r = "Not a Prime Number";
			} else {
				r = "Prime Number";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
