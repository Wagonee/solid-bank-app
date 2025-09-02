package com.example.solidbankapp.core;

import com.example.solidbankapp.domain.model.AccountType;
import com.example.solidbankapp.service.AccountCreationService;

public class BankCore {
    private static long id = 1;
    private long lastAccountNumber = 1;
    AccountCreationService accountCreationService;

    public BankCore(AccountCreationService accountCreationService) {
        this.accountCreationService = accountCreationService;
    }

    public void createNewAccount(AccountType accountType, String clientId, double balance) {
        accountCreationService.create(accountType, clientId, Long.toString(id++), balance);
        incrementLastAccountNumber();
    }
    private void incrementLastAccountNumber() {
        ++lastAccountNumber;
    }
}
