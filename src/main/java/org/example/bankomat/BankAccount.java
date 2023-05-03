package org.example.bankomat;

public class BankAccount {
    private long accountNumber;
    private int pin;
    private double balance;
    private boolean isLogin;

    public BankAccount(long accountNumber, int pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
        this.isLogin = false;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public int getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isLogin() {
        return isLogin;
    }

    public void setIsLogin(boolean isLogin) {
        this.isLogin = isLogin;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Wypłacono " + amount + " zł");
            System.out.println("Saldo po wypłacie: " + balance + " zł");
        } else {
            System.out.println("Niepoprawna kwota wypłaty");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Wpłacono " + amount + " zł");
            System.out.println("Saldo po wpłacie: " + balance + " zł");
        } else {
            System.out.println("Niepoprawna kwota wpłaty");
        }
    }
}
