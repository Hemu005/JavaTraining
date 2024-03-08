package com.object.virtualAtm;

public class Savings extends Account{
    public Savings(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        double minBal=1000;
        if(balance-amount>minBal){
            System.out.println("Minimum balance should be there!");
        }
        else
        super.withdraw(amount);
    }

    @Override
    void deposit(double amount) {

        super.deposit(amount);
    }
}
