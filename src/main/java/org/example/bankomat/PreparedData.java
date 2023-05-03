package org.example.bankomat;

import java.util.ArrayList;
import java.util.List;

public class PreparedData {
//    private AccountService accountService;

    public PreparedData() {
    }

    public List<BankAccount> preparedListOfAccount() {
        List<BankAccount> list = new ArrayList<>();
        BankAccount bankAccount1 = new BankAccount(123456, 2345, 1450);
        BankAccount bankAccount2 = new BankAccount(654321, 1234, 1500);
        BankAccount bankAccount3 = new BankAccount(987456, 1122, 20050);
        BankAccount bankAccount4 = new BankAccount(654789, 9999, 150000);

        list.add(bankAccount1);
        list.add(bankAccount2);
        list.add(bankAccount3);
        list.add(bankAccount4);

        return list;
    }

}

