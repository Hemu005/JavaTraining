package com.exception.basics;

public class Atm {
    public static void main(String[] args) {
        Bank bank=new Bank();
        try {
            bank.withdraw(1500);
            System.out.println("Amount withdrawn");
        }catch (Exception e){
            System.out.println("exception...");
            System.out.println(e.getMessage());
        }
        System.out.println("Good bye");
    }
}
