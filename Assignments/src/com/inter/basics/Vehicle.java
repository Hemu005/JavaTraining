package com.inter.basics;

abstract public class Vehicle implements IInsurance{
    String brand;
    String model;
    double price;

    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void getDetails(){
        System.out.println("Brand :"+brand);
        System.out.println("Model :"+model);
        System.out.println("Price :"+price);
    }
    abstract void getMilage();

    public void insuranceDetails(){
        System.out.println("Insurance Available");
    }
}
