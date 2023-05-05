package org.example.master_mind;

import java.util.*;

public class MasterMindMain {


    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        List<String> earlierNumbers = new ArrayList<String>();
        int[] userNumbers = new int[4];
        int[] numbersToGuess = new int[4];
        int c1 = 0;
        int c2 = 0;
        int chance = 0;
        for (int i = 0; i < numbersToGuess.length; i++) {
            numbersToGuess[i] = random.nextInt(1, 9);
//            System.out.println(numbersToGuess[i]);
        }
        System.out.println("""
                Nowa gra!
                Masz 5 szans na odgadnięcie ułożenia 4 cyfr z zakresu 1 do 8
                Powodzenia!""");
        while (chance < 5) {
            earlierArrangement(userNumbers,earlierNumbers);
            c1 = 0;
            c2 = 0;
            for (int i = 0; i < userNumbers.length; i++) {
                System.out.printf("\nPodaj %d cyfrę", i + 1);
                userNumbers[i] = scanner.nextInt();
            }
            System.out.println("wybrałeś cyfry:");
            for (int i = 0; i < userNumbers.length; i++) {
                System.out.print(userNumbers[i] + " ");
            }
            c1 = countOfNumbersOfGoodPlace(userNumbers, numbersToGuess);
            c2 = countOfGoodNumbers(userNumbers, numbersToGuess);
            if (c1 == 4 && c2 == 4) {
                System.out.println("\nKoniec gry odgadłeś ułożenie cyfr");
                break;
            }
            chance++;
            System.out.printf("\nPozostało szans %d", (5 - chance));
            if (chance == 5) {
                System.out.println("\nSkończyły Ci się szanse");
                System.out.println("Poprawne ułożenie to:");
                System.out.println(Arrays.toString(numbersToGuess));
            }


        }
    }

    private static void earlierArrangement(int[] userNumbers, List<String> earlierNumbers) {
        System.out.println("\nWcześniejsze ułożenia: \n");
        String lastNumbers = Arrays.toString(userNumbers);
        earlierNumbers.add(lastNumbers);
        for (String n :
                earlierNumbers) {
            System.out.println(n);
        }

    }

    private static int countOfNumbersOfGoodPlace(int[] userNumbers, int[] numbersToGuess) {
        int count = 0;
        int[] tempNumbers = copyArray(numbersToGuess);

        for (int i = 0; i < userNumbers.length; i++) {
            if (userNumbers[i] == tempNumbers[i]) {
                count++;
            }
        }
        System.out.printf("\nNa dobrym miejscu jest %d cyfr", count);
        return count;
    }

    public static int countOfGoodNumbers(int[] userNumbers, int[] numbersToGuess) {
        int count = 0;
        int[] tempNumbers = copyArray(numbersToGuess);

        for (int i = 0; i < userNumbers.length; i++) {
            for (int j = 0; j < tempNumbers.length; j++) {
                if (userNumbers[i] == tempNumbers[j]) {
                    count++;
                    tempNumbers[j] = 0;
                    break;
                }
            }
        }
        System.out.printf("\nPodałeś %d poprawnych cyfr", count);
        return count;
    }

    public static int[] copyArray(int[] numberToGuess) {
        int[] copiedArray = new int[numberToGuess.length];
        for (int i = 0; i < copiedArray.length; i++) {
            copiedArray[i] = numberToGuess[i];
        }
        return copiedArray;
    }

}
