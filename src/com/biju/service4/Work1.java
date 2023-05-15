package com.biju.service4;

public class Work1 implements Runnable {

	public int num;
	public int num2;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public Work1(int num, int num2) {
		super();
		this.num = num;
		
	}

	@Override
	public synchronized void run() {

		int num1 = 0;
		int num2 = 1;
		int num3 = 0;

		System.out.print(num1 + " ");
		System.out.print(num2 + " ");

		for (int i = 1; i <= num; i++) {
			num3 = num2;
			num2 = num1 + num2;
			num1 = num3;

			num = num2 ;

		}

	}

}
