package org.example.wisielec;

import java.util.Random;
import java.util.Scanner;

public class WisielecDemo {
    private static final String[] passwords = {"kot i pies", "Niepodległościowiec", "Lumpenproletariat", "Dwudziestogroszówka"};
    private static int count = 5;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.printf("Nowa gra w Wisielca, masz %d żyć:\n", count);
        String passwordToGuess = getPasswordFromArray();

        char[] hiddenWord = new char[passwordToGuess.length()];
        for (int i = 0; i < passwordToGuess.length(); i++) {
            if (passwordToGuess.charAt(i) == ' ') {
                hiddenWord[i] = ' ';
            } else {
                hiddenWord[i] = '-';
            }
        }
//        for (char c :
//                hiddenWord) {
//            System.out.print(c);
//        }
        while (count > 0 && isHiddenLetter(hiddenWord)) {
            System.out.println("""
                    Wybierz: 
                    1 - podaj literę 
                    2 - odgadnij hasło
                    3 - sprawdź ile masz żyć""");
            int choose = scanner.nextInt();
            if (choose == 1) {

                System.out.println("Podaj literę: ");
                char letter = scanner.next().charAt(0);
                checkYourShot(letter, passwordToGuess, hiddenWord);
                if (!isHiddenLetter(hiddenWord)) {
                    System.out.println("Koniec gry wygrałeś");
                }
            } else if (choose == 2) {
                scanner.nextLine();
                String fullPassword = scanner.nextLine();
                enterThePassword(fullPassword, passwordToGuess);
            } else if(choose == 3) {
                System.out.println(count);
            }
        }
    }

    private static String getPasswordFromArray() {
        int length = passwords.length;
        Random random = new Random();
        String pass = passwords[random.nextInt(length)];
        return pass;
    }

    static boolean isHiddenLetter(char[] hiddenWord) {
        for (char h : hiddenWord) {
            if (h == '-') {
                return true;
            }
        }
        return false;
    }

    static void checkYourShot(char letter, String passwordToGuess, char[] hiddenWord) {
        boolean correctShot = false;
        for (int i = 0; i < passwordToGuess.length(); i++) {
            if (passwordToGuess.charAt(i) == letter) {
                hiddenWord[i] = letter;
                correctShot = true;
            }
        }
        if (correctShot) {
            System.out.println("Dobrze!");
        } else {
            count--;
            System.out.printf("Żle! Masz %d szanse.\n", count);
        }
        System.out.println(hiddenWord);
    }

    private static void enterThePassword(String fullPassword, String passwordToGuess) {
        if (fullPassword.equalsIgnoreCase(passwordToGuess)) {
            System.out.println("Gratulacje! Prawidłowe hasło");
        } else {
            System.out.println("źle tracisz dwie szanse");
            count -= 2;
        }

    }
}