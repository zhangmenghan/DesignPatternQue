package com.seventhclass1;

public abstract class Builder {
	public abstract void makeTitle(String title) throws Exception;
	public abstract void makeString(String string);
	public abstract void makeItems(String[] items);
	public abstract void close();
}
