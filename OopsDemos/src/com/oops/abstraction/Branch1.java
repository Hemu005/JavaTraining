package com.oops.abstraction;

public class Branch1 extends Bank {
    @Override
    void carLoan() {
        System.out.println("Car loan from Branch1");
    }

    @Override
    void housingLoan() {
        System.out.println("House loan from Branch1");
    }

    @Override
    void eduLoan() {
        System.out.println("Education loan from Branch1");
    }

    void payInterest(){
        System.out.println("payment in Branch1");
    }
}
