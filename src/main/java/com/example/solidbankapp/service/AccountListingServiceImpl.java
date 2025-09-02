package com.example.solidbankapp.service;

import com.example.solidbankapp.data.AccountDAO;
import com.example.solidbankapp.domain.model.Account;
import com.example.solidbankapp.domain.model.AccountType;
import com.example.solidbankapp.domain.model.AccountWithdraw;

import java.util.List;

public class AccountListingServiceImpl implements AccountListingService {

    AccountDAO accountDAO;

    public AccountListingServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public Account getClientAccount(String clientId, String accountId) {
        return accountDAO.getClientAccount(clientId, accountId);
    }

    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientId, String accountId) {
        return accountDAO.getClientWithdrawAccount(clientId, accountId);
    }

    @Override
    public List<Account> getClientAccounts(String clientId) {
        return accountDAO.getClientAccount(clientId);
    }

    @Override
    public List<Account> getClientAccountsByType(String clientId, AccountType accountType) {
        return accountDAO.getClientAccountsByType(clientId, accountType);
    }
}
