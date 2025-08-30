package com.example.solidbankapp.domain.model;

public class AccountDeposit extends Account {
    public AccountDeposit(AccountType accountType, String id, String clientId, double balance) {
        super(accountType, id, clientId, balance, false);
    }
}
