package com.biju.service4;

public class Work2 implements Runnable{
	
	String name;
	String name2;
	String name3;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getName2() {
		return name2;
	}


	public void setName2(String name2) {
		this.name2 = name2;
	}

	

	public String getName3() {
		return name3;
	}


	public void setName3(String name3) {
		this.name3 = name3;
	}


	public Work2(String name, String name2, String name3) {
		super();
		this.name = name;
		this.name2 = name2;
		
	}


	@Override
	public synchronized void run() {
		
		String name3 = "";
		
		if (name.length() != name2.length()) {
			System.out.println("not a Anagram");
		} else {

			for (int i = 0; i <= name.length() - 1; i++) {
				char a = name.charAt(i);

				for (int j = 0; j <= name2.length() - 1; j++) {
					char b = name.charAt(j);

					if (a == b) {
						name3 = name3 + a;
						break;

					}
				}
			}
			if (name.equals(name3)) {
				name3 = "Anagram";
			} else {
				name3 = "not a Anagram";
			}
		}
		
	}

}
