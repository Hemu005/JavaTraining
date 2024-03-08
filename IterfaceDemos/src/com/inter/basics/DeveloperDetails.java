package com.inter.basics;

public class DeveloperDetails implements IEntertainment {
    @Override
    public void shoeGames(String type) {
        if(type.equals("indoor"))
            System.out.println("Carrom and Suttel available");
        else
            System.out.println("Cricket");
    }

    @Override
    public void showActivity() {
        System.out.println("Weekly lunch outing");
    }
}
