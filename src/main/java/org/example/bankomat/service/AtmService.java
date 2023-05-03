package org.example.bankomat.service;

import org.example.bankomat.BankAccount;

import java.util.Scanner;

public class AtmService {
    private Scanner scanner = new Scanner(System.in);

    public void printMenuAfterLogin(BankAccount bankAccount) {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Witaj Wybierz opcję:");
            System.out.println("1. Wypłata");
            System.out.println("2. Wpłata");
            System.out.println("3. Wyświetl saldo");
            System.out.println("4. Wyloguj");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    withdrawMoney(bankAccount);
                    break;
                case 2:
                    depositMoney(bankAccount);
                    break;
                case 3:
                    checkBalance(bankAccount);
                    break;
                case 4:
                    bankAccount.setIsLogin(false);
                    isRunning = false;
                    break;
                default:
                    System.out.println("Niepoprawna opcja");
                    break;
            }
        }
    }

    public void withdrawMoney(BankAccount bankAccount) {
        System.out.println("Podaj kwotę do wypłaty");
        double amount = scanner.nextDouble();
        if (amount <= bankAccount.getBalance() && amount > 0) {
            bankAccount.withdraw(amount);
            System.out.println("Wypłacono " + amount + " PLN. Saldo po wypłacie: " + bankAccount.getBalance() + " PLN");
        } else {
            System.out.println("Nieprawidłowa kwota do wypłaty");
        }
    }

    public void depositMoney(BankAccount bankAccount) {
        System.out.println("Podaj kwotę do wpłaty");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            bankAccount.deposit(amount);
            System.out.println("Wpłacono " + amount + " PLN. Saldo po wpłacie: " + bankAccount.getBalance() + " PLN");
        } else {
            System.out.println("Nieprawidłowa kwota do wpłaty");
        }
    }

    public void checkBalance(BankAccount bankAccount) {
        System.out.println("Twoje saldo wynosi: " + bankAccount.getBalance() + " PLN");
    }
}
