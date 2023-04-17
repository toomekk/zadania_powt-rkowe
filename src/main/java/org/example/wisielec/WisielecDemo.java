package org.example.wisielec;

import java.util.*;

public class WisielecDemo {
    private static final String[] passwords = {"kot i pies", "Niepodległościowiec", "Lumpenproletariat", "Dwudziestogroszówka"};
    private static int count = 5;
    private static List<Character> listOfletters = new ArrayList<>();
    private static String passwordToGuess;
    private static char[] hiddenWord;

    public static String getPasswordToGuess() {
        return passwordToGuess;
    }

    public static void setPasswordToGuess(String passwordToGuess) {
        WisielecDemo.passwordToGuess = passwordToGuess;
    }

    public static char[] getHiddenWord() {
        return hiddenWord;
    }

    public static void setHiddenWord(char[] hiddenWord) {
        WisielecDemo.hiddenWord = hiddenWord;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        start();
        while (count > 0 && isHiddenLetter(hiddenWord)) {
            int choose = 0;
            boolean isTrue = false;
            while (!isTrue) {
                try {
                    printMenu();
                    scanner.nextLine();
                    choose = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("podaj cyfrę z zakresu 1 do 4");
                }
                if (choose == 1 || choose == 2 || choose == 3 || choose == 4) {
                    isTrue = true;
                }
            }
            if (choose == 1) {
                System.out.println("Podaj literę: ");
                char letter = scanner.next().charAt(0);
                addToCharList(letter);
                checkYourShot(letter, passwordToGuess, hiddenWord);
                if (!isHiddenLetter(hiddenWord)) {
                    System.out.println("Koniec gry wygrałeś");
                }
            } else if (choose == 2) {
                System.out.println("Podaj hasło");
                scanner.nextLine();
                String fullPassword = scanner.nextLine();
                enterThePassword(fullPassword, passwordToGuess);
            } else if (choose == 3) {
                System.out.printf("pozostało Ci jescze: %d szans\n", count);
            } else if (choose == 4) {
                System.out.println("Do tej pory podałeś nstępujące litery:\n");
                for (char c :
                        listOfletters) {
                    System.out.printf("%s, ",c);
                }
                System.out.println("");

            }

        }
    }

    public static void start() {
        System.out.printf("Nowa gra w Wisielca, masz %d żyć:\n", count);
        setPasswordToGuess(getPasswordFromArray());
        char[] hiddenWord = new char[passwordToGuess.length()];
        for (int i = 0; i < passwordToGuess.length(); i++) {
            if (passwordToGuess.charAt(i) == ' ') {
                hiddenWord[i] = ' ';
            } else {
                hiddenWord[i] = '-';
            }
            setHiddenWord(hiddenWord);
        }
    }
// toDo: Poprawić pętlę w printMenu(); - teraz trzeba wpisać dwa razy cyfrę żeby wybrać działanie
    public static void printMenu() {
        System.out.println("""
                Wybierz: 
                1 - podaj literę 
                2 - odgadnij hasło
                3 - sprawdź ile masz żyć
                4 - sprawdź jakie litery już podałeś""");

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

    public static void enterThePassword(String fullPassword, String passwordToGuess) {
        if (fullPassword.equalsIgnoreCase(passwordToGuess)) {
            System.out.println("Gratulacje! Prawidłowe hasło");
        } else {
            System.out.println("źle tracisz dwie szanse");
            count -= 2;
        }
    }

    public static List<Character> addToCharList(char letter) {
        if (listOfletters.contains(letter)) {
            System.out.println("To już było");
        } else {
            listOfletters.add(letter);
        }
        return listOfletters;
    }
}