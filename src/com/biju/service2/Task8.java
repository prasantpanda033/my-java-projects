package com.biju.service2;

public class Task8 implements Task6 {

	@Override
	public int sum(int x, int y) {
		
		return x+y;
	}
	public static void main(String[] args) {
		
		Task8 task = new Task8();
		System.out.println(task.sum(9,1));
	}

}
