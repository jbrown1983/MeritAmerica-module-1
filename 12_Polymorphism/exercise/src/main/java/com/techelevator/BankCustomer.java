package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>();


    public Accountable[] getAccounts() {
      /*  Accountable[] acc = new Accountable[this.accounts.size()];
        for (int i = 0; i < this.accounts.size(); i++) {
            acc[i] = this.accounts.get(i);
        }
      */  return accounts.toArray(new Accountable[accounts.size()]);
        }

    public void addAccount(Accountable newAccount) {
            accounts.add(newAccount);
        }


    // Getters
    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    // Setters
    public void setName(String newName) {
        this.name = newName;
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    public void setPhoneNumber(String newPhone) {
        this.phoneNumber = newPhone;
    }

   // public void setAccounts(ArrayList<Accountable> newAccounts) {
     //   this.accounts = newAccounts;



    public boolean isVip() {
        int balance = 0;
        for (Accountable curAcc : accounts) {
            balance = balance + curAcc.getBalance();
        }
        return balance >= 25000;
    }
}

