package com.thirdclass;

public class Main {
	public static void main(String[] args) {
		AbstractDisplay d1 = new CharDisplay('M');
		d1.display();
		AbstractDisplay d2 = new StringDisplay("Hello World");
		d2.display();
	}
}
