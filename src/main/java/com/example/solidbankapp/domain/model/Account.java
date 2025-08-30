package com.example.solidbankapp.domain.model;

public class Account {
    private AccountType accountType;
    private String accountId;
    private String clientId;
    private double balance;
    private final boolean depositAllowed;

    public Account(AccountType accountType, String id, String clientId, double balance, boolean depositAllowed) {
        setAccountType(accountType);
        setAccountId(id);
        setClientId(clientId);
        setBalance(balance);
        this.depositAllowed = depositAllowed;
    }


    public double getBalance() {
        return balance;
    }

    public String getClientId() {
        return clientId;
    }



    public boolean isDepositAllowed() {
        return depositAllowed;
    }

    public AccountType getAccountType() {
        return accountType;
    }


    private void setAccountTypePrivate(AccountType accountType) {
        this.accountType = accountType;
    }

    public void setAccountType(AccountType accountType) {
        setAccountTypePrivate(accountType);
    }

    private void setAccountIdPrivate(String accountId) {
        this.accountId = accountId;
    }

    public void setAccountId(String accountId) {
        setAccountIdPrivate(accountId);
    }

    private void setBalancePrivate(double balance) {
        this.balance = balance;
    }

    public void setBalance(double balance) {
        setBalancePrivate(balance);
    }

    public void setClientIdPrivate(String clientId) {
        this.clientId = clientId;
    }

    public void setClientId(String clientId) {
       setClientIdPrivate(clientId);
    }

    public String getAccountId() {
        return accountId;
    }














    @Override
    public String toString() {
        return "Account{" +
                "accountType=" + accountType +
                ", id='" + accountId + '\'' +
                ", clientId='" + clientId + '\'' +
                ", balance=" + balance +
                ", withdrawAllowed=" + depositAllowed +
                '}';
    }
}
