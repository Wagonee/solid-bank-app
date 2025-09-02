package com.example.solidbankapp.service;

import com.example.solidbankapp.domain.model.Account;
import com.example.solidbankapp.domain.model.AccountType;
import com.example.solidbankapp.domain.model.AccountWithdraw;

import java.util.List;

public interface AccountListingService {

    Account getClientAccount(String clientId, String accountId);
    AccountWithdraw getClientWithdrawAccount(String clientId, String accountId);
    List<Account> getClientAccounts(String clientId);
    List<Account> getClientAccountsByType(String clientId, AccountType accountType);

}
