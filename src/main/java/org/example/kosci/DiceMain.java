package org.example.kosci;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DiceMain {
    private static final Dice dice1 = new Dice(6);
    private static final Dice dice2 = new Dice(6);

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int decision = 0;
        Player player1 = new Player("Gracz 1", true);
        Player player2 = new Player("Gracz 2", false);
        System.out.println("""
                GRA w kości
                Zdobądź odpowiednią wartość przed przeciwnikiem
                Pamiętaj, że przez wartość 1 tracisz kolejkę
                Zapisuj uzbierane punkty na koncie
                Grę zaczyna GRACZ 1
                Powodzenia!
                Podaj jaką wartość ma być uzbierana:""");
        decision = scanner.nextInt();

        while (player1.getSavedSum() < decision && player2.getSavedSum() < decision) {
            if (player1.isPlaying()) {
                showActualPoints(player1, player2);
                System.out.println("""
                        \n\nKOLEJ GRACZA NR 1
                        Jaka jest decyzja?:
                        1. rzucam dalej
                        2. sumuję""");
                decision = scanner.nextInt();
                if (decision == 1) {
                    keepThrowing(player1, player2);
                } else {
                    addUpPoints(player1);
                    player1.setPlaying(false);

                }
            } else {
                showActualPoints(player1, player2);
                System.out.println("""
                        \n\nKOLEJ GRACZA NR 2
                        Jaka jest decyzja?:
                        1. rzucam dalej
                        2. sumuję""");
                decision = scanner.nextInt();
                if (decision == 1) {
                    keepThrowing(player2, player1);
                } else {
                    addUpPoints(player2);
                    player1.setPlaying(true);

                }
            }
        }
        String winner = whoWin(player1, player2);
        System.out.printf("\nWYGRAŁ %s ", winner);

    }

    private static void addUpPoints(Player player) {
        player.setSavedSum(player.getCurrentSum() + player.getSavedSum());
        player.resetSum();
        player.setPlaying(false);
    }

    public static void keepThrowing(Player currentPlayer, Player secondPlayer) {
        dice1.throwDice();
        dice2.throwDice();
        System.out.printf("\nRzucał %s. Wyrzucono: %d i %d", currentPlayer.getName(), dice1.getValue(), dice2.getValue());
        if (dice1.getValue() == 1 || dice2.getValue() == 1) {
            currentPlayer.setPlaying(false);
            secondPlayer.setPlaying(true);
            currentPlayer.resetSum();
        } else {
            currentPlayer.setCurrentSum(currentPlayer.getCurrentSum() + dice1.getValue() + dice2.getValue());
        }
    }

    public static String whoWin(Player player1, Player player2) {
        if (player1.getSavedSum() > player2.getSavedSum()) {
            return player1.getName();
        } else return player2.getName();
    }



    public static void showActualPoints(Player player1, Player player2) {
        System.out.printf("\nBieżace punkty %s, %d ", player1.getName(), player1.getCurrentSum());
        System.out.printf("\nZapisane punkty %s, %d ", player1.getName(), player1.getSavedSum());
        System.out.printf("\nBieżace punkty %s, %d ", player2.getName(), player2.getCurrentSum());
        System.out.printf("\nZapisane punkty %s, %d ", player2.getName(), player2.getSavedSum());
//        Map<String, Integer> mapOfActualResults = new HashMap<>();
//        mapOfActualResults.put("Bieżące punkty" + player1.getName(),player1.getCurrentSum());
//        mapOfActualResults.put("Zapisane punkty" + player1.getName(),player1.getSavedSum());
//        mapOfActualResults.put("Bieżące punkty" + player2.getName(),player2.getCurrentSum());
//        mapOfActualResults.put("Zapisane punkty" + player2.getName(),player2.getSavedSum());
//        System.out.println(mapOfActualResults);
    }

}
