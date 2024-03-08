package com.inter.basics;

public class ManagerDetails implements IEntertainment {
    @Override
    public void shoeGames(String type) {
        if(type.equals("indoor"))
            System.out.println("Chess and Table tennis available");
        else
            System.out.println("Football");
    }

    @Override
    public void showActivity() {
        System.out.println("Monthly trip with developer");
    }
}
