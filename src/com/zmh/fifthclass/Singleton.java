package com.zmh.fifthclass;

public class Singleton {

	private static Singleton singleton = null;
	
	private Singleton() {
//		System.out.println("Create an Instance");
	}
	
	public synchronized static Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	
}
	
	