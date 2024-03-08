package com.inter.basics;

public class Car extends Vehicle implements IExtrenal,IInternal{
    String type;
    public Car(String brand, String model, double price) {
        super(brand, model, price);
    }

    @Override
    void getMilage() {
        System.out.println("20km/ltr");
    }

    @Override
    public void showAcc() {

    }

    @Override
    public void external() {

    }

    @Override
    public void internal() {

    }
    void show(){
        if(type.equals("Seden"))
            System.out.println("Luxury Car");
        else if (type.equals("XUV"))
            System.out.println("Good");
        else
            System.out.println("Average");
    }
}
