package com.exceptions.custom;

public class VoyaAtm {
    public static void main(String[] args) {
        System.out.println("In Atm");
        VoyaBank bank=new VoyaBank(1000);
        try {
            bank.withdraw(5000);
            System.out.println("Amount withdrawn");
        }catch (NegativeBalanceException e){
            System.out.println(e.getMessage());
        }catch (OutOfLimitsException e){
            System.out.println(e.getMessage());
        }
    }
}
