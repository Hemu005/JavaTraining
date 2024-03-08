package com.oops.abstraction;


public class SubBranch extends Branch2 {


    @Override
    void carLoan() {
        System.out.println("Car loan from Branch2");
    }

    @Override
    void eduLoan() {
        System.out.println("Education from SubBranch");
    }

    void subPay(){
        System.out.println("payment from SubBranch");
    }

}
