package com.seventhclass3;

import java.io.FileWriter;
import java.io.PrintWriter;

public class HTMLBuilder extends Builder{

	private String filename;
	private PrintWriter writer;
	
	@Override
	protected void buildTitle(String title) throws Exception {
		filename = title + ".html";
		writer = new PrintWriter(new FileWriter(filename));
		writer.println("<html><head><title>" + title + "</title></head><body>");
		writer.println("<h1>" + title + "</h1>");
	}

	@Override
	protected void buildString(String string) {
		writer.println("<p>" + string + "</p>");
	}

	@Override
	protected void buildItems(String[] items) {
		writer.println("<ul>");
		for (int i = 0; i < items.length; i++) {
			writer.println("<li>" + items[i] + "</li>");
		}
		writer.println("</ul>");
	}

	@Override
	protected void buildDone() {
		writer.println("</head></html>");
		writer.close();
	}

	public String getResult() {
		return filename;
	}
}
