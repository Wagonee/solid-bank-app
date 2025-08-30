package com.example.solidbankapp.domain.model;

public class CheckingAccount extends AccountWithDraw{
    public CheckingAccount(String id, String clientId, double balance) {
        super(AccountType.CHECKING, id, clientId, balance);
    }
}
