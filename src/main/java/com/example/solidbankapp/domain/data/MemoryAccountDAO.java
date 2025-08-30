package com.example.solidbankapp.domain.data;

import com.example.solidbankapp.domain.model.Account;
import com.example.solidbankapp.domain.model.AccountType;
import com.example.solidbankapp.domain.model.AccountWithDraw;

import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public class MemoryAccountDAO implements AccountDAO {

    private List<Account> accountList;

    @Override
    public List<Account> getClientAccount(String clientId) {
        return accountList.stream().filter(acc -> Objects.equals(acc.getClientId(), clientId)).toList();
    }

    @Override
    public void createNewAccount(Account account) {
        accountList.add(account);
    }

    @Override
    public void updateAccount(Account account) {
        var accountToUpdate = accountList.stream().filter(acc -> Objects.equals(acc.getAccountId(), account.getAccountId())).findFirst();
        if (accountToUpdate.isPresent()) {
            int index = accountList.indexOf(accountToUpdate.get());
            accountList.set(index, account);
        }
    }

    @Override
    public List<Account> getClientAccountsByType(String clientId, AccountType accountType) {
        return accountList.stream().filter(acc -> Objects.equals(acc.getAccountType(), accountType)).toList();
    }

    @Override
    public AccountWithDraw getClientWithdrawAccount(String clientId, String accountId) {
        return accountList.stream()
                .filter(account -> account instanceof AccountWithDraw)
                .map(account -> (AccountWithDraw) account)
                .filter(account -> account.getClientId().equals(clientId) &&
                        account.getAccountId().equals(accountId))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Account getClientAccount(String clientId, String accountId) {
        return accountList.stream()
                .filter(account -> account.getClientId().equals(clientId) &&
                        account.getAccountId().equals(accountId))
                .findFirst()
                .orElse(null);
    }
}
