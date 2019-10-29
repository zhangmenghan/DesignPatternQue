package com.secondclass4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperities extends FileIO{

	private Properties properties;
	
	public FileProperities() {
		this.properties = new Properties();
	}
	
	@Override
	public void readFromFile(String filename) throws IOException {
		properties.load(new FileInputStream(filename));
	}

	@Override
	public void writeToFile(String filename) throws IOException {
		properties.store(new FileOutputStream(filename), "written byFileProperties");
	}

	@Override
	public void setValue(String key, String value) {
		properties.setProperty(key, value);
	}

	@Override
	public String getValue(String key) {
		return properties.getProperty(key, "");
	}

}
