package com.example.solidbankapp.service;

import com.example.solidbankapp.data.AccountDAO;
import com.example.solidbankapp.domain.model.*;

public class AccountCreationServiceImpl implements AccountCreationService{

    private final AccountDAO accountDAO;

    public AccountCreationServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public void create(AccountType accountType, String clientId, String accountId, double balance) {
        switch (accountType) {
            case CHECKING -> {
                CheckingAccount acc = new CheckingAccount(accountId, clientId, balance);
                accountDAO.createNewAccount(acc);
            }
            case FIXED -> {
                FixedAccount acc = new FixedAccount(accountId, clientId, balance);
                accountDAO.createNewAccount(acc);
            }
            case SAVING -> {
                SavingAccount acc = new SavingAccount(accountId, clientId, balance);
                accountDAO.createNewAccount(acc);
            }
        }
    }
}
