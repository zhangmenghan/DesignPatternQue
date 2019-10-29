package com.seventhclass3;

public class Main {
	public static void main(String[] args) throws Exception {
		TextBuilder textBuilder = new TextBuilder();
		Director director1 = new Director(textBuilder);
		director1.contract();
		String result = textBuilder.getResult();
		System.out.println(result);

		HTMLBuilder htmlBuilder = new HTMLBuilder();
		Director director2 = new Director(htmlBuilder);
		director2.contract();
		String filename = htmlBuilder.getResult();
		System.out.println(filename + " OK");
	}
}
