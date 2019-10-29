package com.eighthclass;

import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;

public abstract class Page {
	protected String title;
	protected String author;
	protected ArrayList<Item> content = new ArrayList<Item>();
	public Page(String title, String author) {
		this.author = author;
		this.title = title;
	}
	public void add(Item item) {
		content.add(item);
	}
	public void output() throws Exception {
		String filename = title + ".html";
		Writer writer = new FileWriter(filename);
		writer.write(this.makeHTML());
		writer.close();
		System.out.println("OK");
	}
	public abstract String makeHTML();
}
