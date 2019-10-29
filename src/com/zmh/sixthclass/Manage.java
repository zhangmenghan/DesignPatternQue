package com.zmh.sixthclass;

import java.util.HashMap;

public class Manage {
	private HashMap<String,Product> showcase = new HashMap<>();
	public void register(String name,Product proto) {
		showcase.put(name, proto);
	}
	public Product create(String protoname) throws Exception{
		Product p = (Product) showcase.get(protoname);
		return p.createClone();
	}
}
