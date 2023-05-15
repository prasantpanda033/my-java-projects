package com.biju.service2;

public class Task2 implements Task1{

	public static void main(String[] args) {
		
		Task2 task = new Task2();
		System.out.println(task.name("Biju"));
		System.out.println(task.sum(5,7));
	}

	@Override
	public String name(String name) {

		return "Prasanta chandra panda";
	}

	@Override
	public int sum(int x, int y) {
		
		return x+y;
	}

}
