package com.list.custom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Vehicle> vehicles= Arrays.asList(
                new Vehicle("City","Honda",235000),
                new Vehicle("Hexa","Tata",520000),
                new Vehicle("Suzuki","Gixer",200000),
                new Vehicle("Suzuki","Discover",200000));

        for (Vehicle vehicle:vehicles){
            System.out.println(vehicle);
        }
        System.out.println("Sort by brand");
        Collections.sort(vehicles,new BrandSort());

        for (Vehicle vehicle:vehicles){
            System.out.println(vehicle);
        }
        System.out.println("Sort by model");
        Collections.sort(vehicles,new ModelSort());

        for (Vehicle vehicle:vehicles){
            System.out.println(vehicle);
        }
        System.out.println("Sort by price");
        Collections.sort(vehicles,new PriceSort());

        for (Vehicle vehicle:vehicles){
            System.out.println(vehicle);
        }

    }
}
