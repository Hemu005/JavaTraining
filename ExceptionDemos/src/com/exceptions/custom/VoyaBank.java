package com.exceptions.custom;

public class VoyaBank {
    double balance;

    public VoyaBank(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws OutOfLimitsException,NegativeBalanceException{
        System.out.println("In withdraw method");
        try{
            //balance is negative throw NegativeBalanceException
            if(balance-amount<=0)
                throw new NegativeBalanceException("balance is negative");
            //amount>1000 OutOfLimitsException
            if (amount>1000){
                throw new OutOfLimitsException("out of limit");
            }
        }catch (NegativeBalanceException e){
            System.out.println("exception.."+e.getMessage());
            throw e;
        }catch (OutOfLimitsException e){
            System.out.println("exception.."+e.getMessage());
            throw e;
        }
    }
}
