package com.zmh.fourthclass;

public class IDCard extends Product{
	private String owner;
	private int serial;
	
	IDCard(int serial,String owner){
		System.out.println("create " + owner + "(" + serial + ")" + "'s card");
		this.owner = owner;
		this.serial = serial;
	}
	
	public void use() {
		System.out.println("use " + owner + "(" + serial + ")" + "'s card");
	}
	
	public String getOwner() {
		return owner;
	}
	
	public int getSerial() {
		return serial;
	}
}
