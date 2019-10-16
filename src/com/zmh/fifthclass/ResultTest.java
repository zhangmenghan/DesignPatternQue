package com.zmh.fifthclass;

public class ResultTest {
	public static void main(String[] args) {
		//Exec1
		TicketMaker maker = TicketMaker.getTicketMaker();
		System.out.println(maker.getNextTicketNumber());
		System.out.println(maker.getNextTicketNumber());
		System.out.println(maker.getNextTicketNumber());
		System.out.println(maker.getNextTicketNumber());
		System.out.println(maker.getNextTicketNumber());
		
		//Exec2
		Triple triple0 = Triple.getInstance(0);
		Triple triple00 = Triple.getInstance(0);
		Triple triple1 = Triple.getInstance(1);
		Triple triple2 = Triple.getInstance(2);
		System.out.println(triple0.toString());
		System.out.println(triple0 == triple00);
		System.out.println(triple1.toString());
		System.out.println(triple2.toString());
		
		//Exec3
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.toString());
	}
}
