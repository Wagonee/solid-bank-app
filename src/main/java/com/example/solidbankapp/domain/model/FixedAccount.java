package com.example.solidbankapp.domain.model;

public class FixedAccount extends AccountDeposit {
    public FixedAccount(String id, String clientId, double balance) {
        super(AccountType.FIXED, id, clientId, balance);
    }
}
