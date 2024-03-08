package com.objects.basics;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank(50000);
        Scanner sc = new Scanner(System.in);
        System.out.println("Withdraw or Deposit");
        String choice = sc.next();
        System.out.println("Enter the amount:");
        double amount = sc.nextDouble();

        switch (choice){
            case "withdraw":bank.withdraw(amount);
            break;
            case "deposit":bank.deposit(amount);
            break;
        }
        System.out.println("Balance: "+bank.getBalance());
    }
}
