package com.biju.multithread3;

public class ThTask2 implements Runnable{
	int num = 0 ;
	int x;
	int y;	
	
	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	
	
	public ThTask2(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}


	
	@Override
	public void run() {
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
		
	}

}
