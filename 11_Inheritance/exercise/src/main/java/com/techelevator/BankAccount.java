package com.techelevator;



class BankAccount
{
    private   String accountHolderName, accountNumber;
    private int balance;

    public BankAccount(String accountHolderName, String accountNumber)
    {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = 0;

    }

    public BankAccount(String accountHolderName, String accountNumber, int balance)
    {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int deposit(int amountToDeposit)
    {
        this.balance = this.balance + amountToDeposit;
        return this.balance;
    }

    public int withdraw(int amountToWithdraw)
    {
        this.balance = this.balance - amountToWithdraw;
        return this.balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }


}


