package com.secondclass4;

import java.io.IOException;

public abstract class FileIO {
	public abstract void readFromFile(String filename) throws IOException;
	public abstract void writeToFile(String filename) throws IOException;
	public abstract void setValue(String key, String value);
	public abstract String getValue(String key);
}
