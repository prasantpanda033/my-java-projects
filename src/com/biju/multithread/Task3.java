package com.biju.multithread;

public class Task3 implements Runnable{

	private String star;
	private int x;
	

	public String getStar() {
		return star;
	}

	public void setStar(String star) {
		this.star = star;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public Task3(String star, int x) {
		super();
		this.star = star;
		this.x = x;
	}

	@Override
	public void run() {
		
		String a = "";
			try {
				Thread.sleep(6000);
				for (int i = 0; i < x; i++) {
					a = a + star;
				}
				star = a;
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	}

}
