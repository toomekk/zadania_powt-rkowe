package org.example.bankomat.service;

import org.example.bankomat.BankAccount;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class AccountService {
    private BankAccount bankAccount;
    private List<BankAccount> bankAccountList;
    private Scanner scanner = new Scanner(System.in);

    public AccountService(List<BankAccount> bankAccountList) {
        this.bankAccountList = bankAccountList;
    }


    public void login() {
        System.out.println("Podaj numer konta");
        long cardNumber = scanner.nextLong();
        Optional<BankAccount> actualBankAccount = bankAccountList.stream().filter(b -> b.getAccountNumber() == cardNumber).findFirst();
        System.out.println(actualBankAccount);
        System.out.println("Podaj kod pin do konta");
        int pin = scanner.nextInt();
        if (actualBankAccount.isPresent()) {
            if (actualBankAccount.get().getPin() == pin)
            {
                System.out.println("Pin prawidłowy. Co chcesz zrobić?");
//                menu(); //todo dopisać menu
            }else{
                System.out.println("Pin błędny! pozostało szans"); //todo: dopisać kod pozwalający podać 3 razy błędny pin
            }
        } else {
            System.out.println("nie ma takiego konta");
        }

    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccountList.add(bankAccount);

    }
}
