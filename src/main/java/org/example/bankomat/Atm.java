package org.example.bankomat;

import java.util.List;
import java.util.Scanner;

public class Atm {

    private double cashInATM = 500000;
    private List<BankAccount> bankAccounts;

    public Atm(double cashInATM, List<BankAccount> bankAccounts) {
        this.cashInATM = cashInATM;
        this.bankAccounts = bankAccounts;
    }

    public Atm() {

    }

    public double getCashInATM() {
        return cashInATM;
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(BankAccount bankAccount) {
        this.bankAccounts.add(bankAccount);
    }

}
