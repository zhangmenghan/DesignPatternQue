package com.seventhclass1;

public class TextBuilder extends Builder{
	private StringBuffer buffer = new StringBuffer();

	@Override
	public void makeTitle(String title) throws Exception {
		buffer.append("====================\n");
		buffer.append("<" + title + ">\n");
	}

	@Override
	public void makeString(String string) {
		buffer.append('*' + string + "\n");
	}

	@Override
	public void makeItems(String[] items) {
		for (int i = 0; i < items.length; i++) {
			buffer.append("  ." + items[i] + "\n");
		}
	}

	@Override
	public void close() {
		buffer.append("====================");
	}
	
	public String getResult() {
		return buffer.toString();
	}
}
