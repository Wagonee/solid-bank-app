package com.example.solidbankapp.domain.model;

public class CheckingAccount extends AccountWithdraw {
    public CheckingAccount(String id, String clientId, double balance) {
        super(AccountType.CHECKING, id, clientId, balance);
    }
}
