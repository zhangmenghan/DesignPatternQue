package com.zmh.sixthclass;

public class Main {
	public static void main(String[] args) throws Exception {
		Manage manage = new Manage();
		UnderlinePen underlinePen = new UnderlinePen('~');
		MessageBox mBox = new MessageBox('*');
		MessageBox sBox = new MessageBox('/');
		manage.register("strong message", underlinePen);
		manage.register("warning box", mBox);
		manage.register("slash box", sBox);
		
		Product p1 = manage.create("strong message");
		p1.use("Hello world");
		Product p2 = manage.create("warning box");
		p2.use("Hello world");
		Product p3 = manage.create("slash box");
		p3.use("Hello world");
	}
}
