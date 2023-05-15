package com.biju.multithread2;

public class ThreadTask2 implements Runnable {

	int num1;
	int num2;
	int num3;
	int num4;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}

	public int getNum4() {
		return num4;
	}

	public void setNum4(int num4) {
		this.num4 = num4;
	}

	public ThreadTask2(int num1, int num2, int num3, int num4) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(4000);
			for (int i = 0; i <= num1; i++) {
				num4 = num2 + num3;
				System.out.print(num4);
				num2 = num3;
				num3 = num4;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
