package com.oops.bean;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        vehicle.setBrand("Suzuki");
        System.out.println(vehicle.getBrand());

        vehicle.setModel("NS200");
        System.out.println(vehicle.getModel());

        vehicle.setPrice(150000);
        System.out.println(vehicle.getPrice());

        System.out.println(vehicle.toString());
    }
}
