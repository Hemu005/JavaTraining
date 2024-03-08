package com.objects.basics;

public class Bank {
    double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount){
        if(amount>0){
            balance=balance-amount;
            System.out.println("Amount withdraw succesfully");
        }
    }

    public double getBalance() {
        return balance;
    }

    void deposit(double amount){
        balance=balance+amount;
    }

}
