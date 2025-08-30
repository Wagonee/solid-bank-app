package com.example.solidbankapp.domain.model;

public class AccountWithDraw extends Account{
    public AccountWithDraw(AccountType accountType, String id, String clientId, double balance) {
        super(accountType, id, clientId, balance, true);
    }
}
