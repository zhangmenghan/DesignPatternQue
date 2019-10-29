package com.secondclass3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperities extends Properties implements FileIO{

	private static final long serialVersionUID = 1L;

	@Override
	public void readFromFile(String filename) throws IOException {
		load(new FileInputStream(filename));
	}

	@Override
	public void writeToFile(String filename) throws IOException {
		store(new FileOutputStream(filename), "written byFileProperties");
	}

	@Override
	public void setValue(String key, String value) {
		setProperty(key, value);
	}

	@Override
	public String getValue(String key) {
		return getProperty(key, "");
	}

}
