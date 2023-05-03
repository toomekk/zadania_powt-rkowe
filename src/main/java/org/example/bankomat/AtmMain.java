package org.example.bankomat;

import org.example.bankomat.service.AtmService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class AtmMain {
    private static Scanner scanner = new Scanner(System.in);
    private static AtmService atmService = new AtmService();
    private static List<BankAccount> bankAccountList = new ArrayList<>();

    public static void main(String[] args) {
        PreparedData preparedData = new PreparedData();
        bankAccountList = preparedData.preparedListOfAccount();

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Witaj w bankomacie. Wybierz opcję:");
            System.out.println("1. Logowanie");
            System.out.println("2. Zakończ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Niepoprawna opcja");
                    break;
            }
        }
    }

    public static void login() {
        System.out.println("Podaj numer konta");
        long cardNumber = scanner.nextLong();
        Optional<BankAccount> actualBankAccount = bankAccountList.stream().filter(b -> b.getAccountNumber() == cardNumber).findFirst();

        if (actualBankAccount.isPresent()) {
            System.out.println("Podaj kod PIN do konta");
            int pin = scanner.nextInt();
            BankAccount bankAccount = actualBankAccount.get();
            if (bankAccount.getPin() == pin) {
                bankAccount.setIsLogin(true);
                System.out.println("Logowanie zakończone powodzeniem");
                atmService.printMenuAfterLogin(bankAccount);
            } else {
                System.out.println("Niepoprawny kod PIN");
            }
        } else {
            System.out.println("Nie znaleziono konta");
        }
    }
}
