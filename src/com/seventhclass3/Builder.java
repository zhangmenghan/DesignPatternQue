package com.seventhclass3;

public abstract class Builder {
	private boolean initialized = false;
	public void makeTitle(String title) throws Exception {
		if (!initialized) {
			buildTitle(title);
			initialized = true;
		}
	}
	public void makeString(String string) {
		if (initialized) {
			buildString(string);
		}
	}
	public void makeItems(String[] items) {
		if (initialized) {
			buildItems(items);
		}
	}
	public void close() {
		if (initialized) {
			buildDone();
		}
	}
	protected abstract void buildTitle(String title) throws Exception;
	protected abstract void buildString(String string);
	protected abstract void buildItems(String[] items);
	protected abstract void buildDone();
}
