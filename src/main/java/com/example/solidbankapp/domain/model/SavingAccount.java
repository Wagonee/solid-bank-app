package com.example.solidbankapp.domain.model;

public class SavingAccount extends AccountWithdraw {
    public SavingAccount(String id, String clientId, double balance) {
        super(AccountType.SAVING, id, clientId, balance);
    }
}
