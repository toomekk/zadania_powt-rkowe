package org.example.bankomat;

import org.example.bankomat.service.AccountService;

import java.util.List;

public class AtmMain {
    public static void main(String[] args) {


        preparedData preparedData = new preparedData();
        List<BankAccount> list = preparedData.prepareListOfAccount();
        AccountService bankAccountService = new AccountService(list);
        bankAccountService.login();



    }
}
