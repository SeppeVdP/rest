package com.example.rest;

public class Account {
    private int AccountId;
    private double balance;

    public int getAccountId() {
        return AccountId;
    }

    public void setAccountId(int accountId) {
        AccountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void addMoney(double balance) {
        this.balance += balance;
    }

    public void deductMoney(double balance) {
        this.balance -= balance;
    }

    public Account(int accountId, double balance) {
        AccountId = accountId;
        this.balance = balance;
    }
}
