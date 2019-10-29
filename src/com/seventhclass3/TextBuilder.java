package com.seventhclass3;

public class TextBuilder extends Builder{
	private StringBuffer buffer = new StringBuffer();

	@Override
	protected void buildTitle(String title) throws Exception {
		buffer.append("====================\n");
		buffer.append("<" + title + ">\n");
	}

	@Override
	protected void buildString(String string) {
		buffer.append('*' + string + "\n");
	}

	@Override
	protected void buildItems(String[] items) {
		for (int i = 0; i < items.length; i++) {
			buffer.append("  ." + items[i] + "\n");
		}
	}

	@Override
	protected void buildDone() {
		buffer.append("====================");
	}
	
	public String getResult() {
		return buffer.toString();
	}
}
