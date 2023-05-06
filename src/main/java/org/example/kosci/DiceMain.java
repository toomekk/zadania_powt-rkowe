package org.example.kosci;

import java.util.Random;

public class DiceMain {
    public static void main(String[] args) {
        int die1Sides = 6;
        int die2Sides = 6;
        boolean player = true;

        int player1sum = 0;
        int player2sum = 0;

        Dice dice1 = new Dice(die1Sides);
        Dice dice2 = new Dice(die2Sides);

        while (player1sum < 100 && player2sum < 100) {
            if (player) {
                dice1.throwDice();
                dice2.throwDice();

                System.out.printf("\nRzucał GRACZ 1. Wyrzucono: %d i %d", dice1.getValue(), dice2.getValue());
                if (dice1.getValue() == 1 || dice2.getValue() == 1) {
                    player = false;
                } else {
                    player1sum = player1sum + dice1.getValue() + dice2.getValue();
                }
            } else {
                dice1.throwDice();
                dice2.throwDice();

                System.out.printf("\nRzucał GRACZ 2. Wyrzucono: %d i %d", dice1.getValue(), dice2.getValue());
                if (dice1.getValue() == 1 || dice2.getValue() == 1) {
                    player = true;
                } else {
                    player2sum = player2sum + dice1.getValue() + dice2.getValue();
                }

            }

        }

        if (player1sum > player2sum) {
            System.out.printf("\nWYGRAŁ GRACZ 1 zdobywając: %d punków", player1sum);
        } else {
            System.out.printf("\nWYGRAŁ GRACZ 2 zdobywając: %d punków", player2sum);
        }
    }
}
