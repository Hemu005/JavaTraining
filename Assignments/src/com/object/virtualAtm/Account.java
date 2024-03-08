package com.object.virtualAtm;

public class Account {
    double balance;

    public Account(double balance) {
        this.balance = balance;
    }
    void withdraw(double amount){
        if(amount>0){
            balance=balance-amount;
            System.out.println("Amount withdraw succesfully");
        }
        else
            System.out.println("Insufficient Fund");
    }
    void deposit(double amount){
        balance=balance+amount;
    }
    public double getBalance() {
        return balance;
    }
}
