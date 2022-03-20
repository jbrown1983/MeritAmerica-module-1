package com.techelevator;

    class CheckingAccount extends BankAccount {
        public CheckingAccount(String accountHolderName, String accountNumber) {
            super(accountHolderName,accountNumber);
        }

        public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
            super(accountHolderName,accountNumber,balance);
        }

        public int withdraw(int amountToWithdraw) {
            int balance = getBalance();

            if(balance-amountToWithdraw > 0) {
                balance = balance-amountToWithdraw;
                return balance;
            }

            if(balance-amountToWithdraw < 0 && balance-amountToWithdraw > -100) {
                balance = balance-amountToWithdraw-10;
                return balance;
            }
            else
                return balance;
        }
    }


