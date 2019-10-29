package com.seventhclass3;

public class Director {
	private Builder builder;
	public Director(Builder builder) {
		this.builder = builder;
	}
	public void contract() throws Exception {
		builder.makeTitle("Greeting");
		builder.makeString("Morning  to Noon");
		builder.makeItems(new String[] {"Good Morning", "Good Noon"});
		builder.makeString("Night");
		builder.makeItems(new String[] {"Good night", "Good evening", "Bye"});
		builder.close();
	}
}
