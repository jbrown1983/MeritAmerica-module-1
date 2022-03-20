package com.techelevator;

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName,accountNumber);
    }
    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName,accountNumber,balance);
    }
    public int withdraw(int amountToWithdraw) {
        int balance = getBalance();

        if(balance-amountToWithdraw > 150) {
            balance = balance-amountToWithdraw;
            setBalance(balance);
            return balance;
        }
        if(balance-amountToWithdraw < 150 && balance-amountToWithdraw > 0) {
            balance = balance-amountToWithdraw-2;
            setBalance(balance);
            return balance;
        }
        else
            return balance;
    }
}
