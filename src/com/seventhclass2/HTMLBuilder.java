package com.seventhclass2;

import java.io.FileWriter;
import java.io.PrintWriter;

public class HTMLBuilder implements Builder{

	private String filename;
	private PrintWriter writer;
	
	@Override
	public void makeTitle(String title) throws Exception {
		filename = title + ".html";
		writer = new PrintWriter(new FileWriter(filename));
		writer.println("<html><head><title>" + title + "</title></head><body>");
		writer.println("<h1>" + title + "</h1>");
	}

	@Override
	public void makeString(String string) {
		writer.println("<p>" + string + "</p>");
	}

	@Override
	public void makeItems(String[] items) {
		writer.println("<ul>");
		for (int i = 0; i < items.length; i++) {
			writer.println("<li>" + items[i] + "</li>");
		}
		writer.println("</ul>");
	}

	@Override
	public void close() {
		writer.println("</head></html>");
		writer.close();
	}

	public String getResult() {
		return filename;
	}
}
