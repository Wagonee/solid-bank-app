package com.example.solidbankapp.ui;

import com.example.solidbankapp.core.BankCore;
import com.example.solidbankapp.domain.model.Account;
import com.example.solidbankapp.domain.model.AccountType;
import com.example.solidbankapp.service.AccountListingService;

import java.util.List;

public class AccountBasicCLI {
    private final CreateAccountOperationUI createAccountOperationUI;
    private final BankCore bankCore;
    private final AccountListingService accountListingService;

    public AccountBasicCLI(CreateAccountOperationUI createAccountOperationUI, BankCore bankCore, AccountListingService accountListingService) {
        this.createAccountOperationUI = createAccountOperationUI;
        this.bankCore = bankCore;
        this.accountListingService = accountListingService;
    }

    public void createAccountRequest(String clientId) {
        AccountType accountType = ((MyCLI) createAccountOperationUI).requestAccountType();
        if (accountType == null) {
            System.out.println("Please select correct account type");
            return;
        }
        bankCore.createNewAccount(accountType, clientId, 0);
        System.out.println("Bank account created");
    }

    public void getAccounts(String clientId) {
        List<Account> accounts = accountListingService.getClientAccounts(clientId);
        for (var acc : accounts) {
            System.out.println(acc);
        }
    }
}
