package com.example.solidbankapp.domain.model;

public class AccountWithdraw extends Account{
    public AccountWithdraw(AccountType accountType, String id, String clientId, double balance) {
        super(accountType, id, clientId, balance, true);
    }
}
