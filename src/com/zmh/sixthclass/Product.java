package com.zmh.sixthclass;

public abstract class Product implements Cloneable {
	public abstract void use(String s);
	public Product createClone() throws Exception{
		Product p = null;
		p = (Product) clone();
		return p;
	}
}
