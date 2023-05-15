package com.biju.multithread2;

public class ThreadTask1 implements Runnable {

	String word;
	char letter;
	int count;

	
	public ThreadTask1(String word, char letter, int count) {
		super();
		this.word = word;
		this.letter = letter;
		this.count = count;
	}

	

	public String getWord() {
		return word;
	}



	public void setWord(String word) {
		this.word = word;
	}



	public char getLetter() {
		return letter;
	}



	public void setLetter(char letter) {
		this.letter = letter;
	}



	public int getCount() {
		return count;
	}



	public void setCount(int count) {
		this.count = count;
	}



	@Override
	public void run() {
		try {
			Thread.sleep(6000);
			for (int i = 0; i <= word.length() - 1; i++) {
				letter = word.charAt(i);
				if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
					count++;
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
