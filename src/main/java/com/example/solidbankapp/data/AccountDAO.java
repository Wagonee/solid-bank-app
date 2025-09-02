package com.example.solidbankapp.data;

import com.example.solidbankapp.domain.model.Account;
import com.example.solidbankapp.domain.model.AccountType;
import com.example.solidbankapp.domain.model.AccountWithdraw;

import java.util.List;

public interface AccountDAO {
    List<Account> getClientAccount(String clientId);

    void createNewAccount(Account account);

    void updateAccount(Account account);

    List<Account> getClientAccountsByType(String clientId, AccountType accountType);

    AccountWithdraw getClientWithdrawAccount(String clientId, String accountId);

    Account getClientAccount(String clientId, String accountId);
}
