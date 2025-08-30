package com.example.solidbankapp.domain.data;

import com.example.solidbankapp.domain.model.Account;
import com.example.solidbankapp.domain.model.AccountType;
import com.example.solidbankapp.domain.model.AccountWithDraw;
import org.apache.logging.log4j.message.StringFormattedMessage;

import java.util.List;

public interface AccountDAO {
    List<Account> getClientAccount(String clientId);

    void createNewAccount(Account account);

    void updateAccount(Account account);

    List<Account> getClientAccountsByType(String clientId, AccountType accountType);

    AccountWithDraw getClientWithdrawAccount(String clientId, String accountId);

    Account getClientAccount(String clientId, String accountId);
}
