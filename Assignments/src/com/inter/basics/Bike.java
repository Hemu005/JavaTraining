package com.inter.basics;

public class Bike extends Vehicle implements IExtrenal {
    String capacity;
    public Bike(String brand, String model, double price) {
        super(brand, model, price);
    }

    @Override
    void getMilage() {
        System.out.println("60km/ltr");
    }

    @Override
    public void showAcc() {
        System.out.println("");
    }

    @Override
    public void external() {

    }
    void showType(){

    }
}
