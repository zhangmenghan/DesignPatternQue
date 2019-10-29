package com.secondclass4;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		FileIO f = new FileProperities();
		f.readFromFile("D:\\file.txt");
		System.out.println(f.getValue("year"));
		f.setValue("year", "2019");
		f.setValue("month", "10");
		f.setValue("day", "31");
		f.writeToFile("newfile.txt");
	}
}
