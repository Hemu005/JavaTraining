package com.oops.overloading;

public class VehiclelMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.getTitle();
        System.out.println("------------------");
        Vehicle vehicle1 = new Vehicle("TATA");
        vehicle1.getTitle();
        System.out.println("--------------------");
        Vehicle vehicle2= new Vehicle("TATA","Safari");
        vehicle2.getTitle();
        System.out.println("---------------------");
        Vehicle vehicle3 = new Vehicle("TATA","Safari",1500000);
        vehicle3.getTitle();
    }
}
