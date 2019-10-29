package com.tenthclass1;

import com.tenthclass.Hand;
import com.tenthclass.Player;
import com.tenthclass.ProbStrategy;
import com.tenthclass.WinningStrategy;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Usage: java Main randomseed1 randomseed2");
        System.out.println("Example: java Main 314 15");
        
        int seed1 = 314;
        int seed2 = 15;
        Player player1 = new Player("Taro", new ProbStrategy(seed1));
        Player player2 = new Player("Hana", new WinningStrategy(seed2));
        for (int i = 0; i < 10000; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner:" + player1);
                player1.win();
                player2.lose();
            } else if (nextHand2.isStrongerThan(nextHand1)) {
                System.out.println("Winner:" + player2);
                player1.lose();
                player2.win();
            } else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }
        System.out.println("Total result:");
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }
}
