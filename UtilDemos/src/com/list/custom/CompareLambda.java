package com.list.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareLambda {
    public static void main(String[] args) {
        List<Vehicle> vehicles= Arrays.asList(
                new Vehicle("City","Honda",235000),
                new Vehicle("Hexa","Tata",520000),
                new Vehicle("Suzuki","Gixer",200000),
                new Vehicle("Suzuki","Discover",200000));

        for (Vehicle vehicle:vehicles){
            System.out.println(vehicle);
        }

        Collections.sort(vehicles,(o1,o2)->o1.getBrand().compareTo(o2.getBrand()));
        for (Vehicle vehicle:vehicles){
            System.out.println(vehicle);
        }

        Collections.sort(vehicles,(o1,o2)->o1.getModel().compareTo(o1.getModel()));
        for (Vehicle vehicle:vehicles){
            System.out.println(vehicle);
        }

        Collections.sort(vehicles,(o1, o2) ->((Double) o1.getPrice()).compareTo(o2.getPrice()));
        for (Vehicle vehicle:vehicles){
            System.out.println(vehicle);
        }

}}
