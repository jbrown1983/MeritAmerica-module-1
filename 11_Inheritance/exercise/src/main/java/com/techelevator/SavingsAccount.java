package com.techelevator;

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    public int withdraw(int  amountToWithdraw) {
        int overDraftFee = 2;
        if (this.getBalance() - amountToWithdraw < 0) {
            return this.getBalance();
        }
        if (this.getBalance() - amountToWithdraw < 150) {
            super.withdraw(amountToWithdraw + overDraftFee);
            return this.getBalance();
        }

        super.withdraw(amountToWithdraw);
        return getBalance();
    }


    }
