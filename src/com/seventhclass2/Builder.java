package com.seventhclass2;

public interface Builder {
	public abstract void makeTitle(String title) throws Exception;
	public abstract void makeString(String string);
	public abstract void makeItems(String[] items);
	public abstract void close();
}
