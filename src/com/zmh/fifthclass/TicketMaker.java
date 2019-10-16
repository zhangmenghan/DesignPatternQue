package com.zmh.fifthclass;

public class TicketMaker {
	private int ticket = 1000;

	private static final TicketMaker maker = new TicketMaker();

	private TicketMaker() {
	};

	public static TicketMaker getTicketMaker() {
		return maker;
	}

	public synchronized int getNextTicketNumber() {
		return ticket++;
	}
}
