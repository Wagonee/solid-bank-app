package com.example.solidbankapp.service;

import com.example.solidbankapp.domain.model.AccountType;

public interface AccountCreationService {
    void create(AccountType accountType, String clientId, String accountId, double balance);
}
