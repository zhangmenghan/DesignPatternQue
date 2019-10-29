package com.thirdclass;

public class StringDisplay extends AbstractDisplay{

	private int width;
	private String str;
	
	public StringDisplay(String str) {
		this.str = str;
		this.width = str.getBytes().length;
	}
	
	public void printLine() {
		System.out.print("+");
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
	
	@Override
	public void open() {
		printLine();
	}

	@Override
	public void close() {
		printLine();
	}

	@Override
	public void print() {
		System.out.println("|" + str + "|");
	}

}
