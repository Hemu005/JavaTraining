package com.exception.basics;

public class Bank {
    double balance;
    void withdraw(int amount) throws Exception{
        System.out.println("Bank");
        try{
            if(amount>1000)
                throw new Exception("Amount is greater than 1000");
            balance=800-amount;
        }catch (Exception e){
            System.out.println("error...");
            throw e;
        }finally {
            System.out.println("close db");
        }
        System.out.println("Completed");
    }
}
