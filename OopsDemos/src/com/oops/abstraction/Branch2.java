package com.oops.abstraction;

public abstract class Branch2 extends Bank {


    @Override
    void housingLoan() {
        System.out.println("House loan from Branch2");
    }

    @Override
    void eduLoan() {
        System.out.println("Education loan from Branch2");
    }

    void staffDetails(){
        System.out.println("Staff details");
    }
}
