package com.zmh.fourthclass;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory{
	private List<Object> owners = new ArrayList<Object>();
	private int serial = 100;
	protected Product createProduct(String owner) {
		return new IDCard(serial++, owner);
	}
	protected void registerProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
	}
	public List<Object> getOwners() {
		return owners;
	}
}
