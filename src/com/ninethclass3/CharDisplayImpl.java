package com.ninethclass3;

public class CharDisplayImpl extends DisplayImpl {
	char startChar;
	char contentChar;
	char eddChar;
	int lineTimes;

	public CharDisplayImpl(char startChar, char contentChar, char eddChar,int lineTimes) {
		this.startChar = startChar;
		this.contentChar = contentChar;
		this.eddChar = eddChar;
		this.lineTimes = lineTimes;
	}

	public void rawOpen() {
		printStart();
	}

	public void rawPrint() {
		for (int i = 0; i < lineTimes; i++) {
			System.out.print(contentChar);
		}
	}

	public void rawClose() {
		printEdd();
	}

	private void printStart() {
		System.out.print(startChar);
	}

	private void printEdd() {
		System.out.print(eddChar);
		System.out.println();
	}
}
