package org.example.bankomat;

import org.example.bankomat.BankAccount;

import java.util.Scanner;

public class Atm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = authenticateUser(scanner);
        if (account == null) {
            System.out.println("Nieudana autoryzacja. Koniec programu.");
            return;
        }

        System.out.println("Witaj w bankomacie.");
        int choice;
        do {
            printMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    checkBalance(account);
                    break;
                case 2:
                    withdrawMoney(account, scanner);
                    break;
                case 3:
                    depositMoney(account, scanner);
                    break;
                case 4:
                    System.out.println("Dziękujemy za skorzystanie z naszych usług. Do widzenia!");
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
            }
        } while (choice != 4);
    }

    private static BankAccount authenticateUser(Scanner scanner) {
        System.out.println("Podaj numer konta:");
        long accountNumber = scanner.nextLong();
        System.out.println("Podaj kod PIN:");
        int pin = scanner.nextInt();
        // TODO: zaimplementuj logikę autoryzacji użytkownika na podstawie numeru konta i kodu PIN
        return null;
    }

    private static void printMenu() {
        System.out.println("\nWybierz jedną z opcji:");
        System.out.println("1. Sprawdź stan konta");
        System.out.println("2. Wypłać pieniądze");
        System.out.println("3. Wpłać pieniądze");
        System.out.println("4. Zakończ");
    }

    private static void checkBalance(BankAccount account) {
        System.out.printf("Stan konta wynosi %.2f zł.%n", account.getBalance());
    }

    private static void withdrawMoney(BankAccount account, Scanner scanner) {
        System.out.println("Podaj kwotę do wypłacenia:");
        double amount = scanner.nextDouble();
        if (account.getBalance()>= amount) {
            System.out.println("Pieniądze zostały wypłacone.");
        } else {
            System.out.println("Nie udało się wypłacić pieniędzy. Brak wystarczających środków na koncie.");
        }
    }

    private static void depositMoney(BankAccount account, Scanner scanner) {
        System.out.println("Podaj kwotę do wpłacenia:");
        double amount = scanner.nextDouble();
        account.deposit(amount);
        System.out.println("Pieniądze zostały wpłacone.");
    }

}
