package com.ninethclass3;

public class Main {
    public static void main(String[] args) {
    	LineDisplay d1 = new LineDisplay(new CharDisplayImpl('|','#','-',2));
    	d1.multiDisplay(6);
    }
}
