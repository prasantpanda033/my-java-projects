package com.biju.service4;

public class Work3 implements Runnable {
	
	int num;
	String name = "";
	
	

	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	

	public Work3(int num) {
		super();
		this.num = num;
	}



	@Override
	public synchronized void run() {
		
		int i = 2;
		int num3 = 0;

		while (i < num) {
			if (num % i == 0) {
				num3++;
			}
			i++;
		}
		if (num3 > 2) {
			name = "Not a prime number";
		} else {
			name = "prime number";
		}
		
	}

}
