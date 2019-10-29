package com.tenthclass;

import java.util.Random;

public class WinningStrategy implements Strategy {
    private Random random;
    private boolean won = false;
    private Hand preHand;
    public WinningStrategy(int seed) {
        random = new Random(seed);
    }
    public void study(boolean win) {
    	won = win;
    }
    public Hand nextHand() {
    	if(!won) {
    		preHand = Hand.getHand(random.nextInt(3));
    	}
        return preHand;
    }
}
