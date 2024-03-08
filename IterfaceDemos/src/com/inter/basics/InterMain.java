package com.inter.basics;

public class InterMain {
    public static void main(String[] args) {
        IEntertainment entertainment=new ManagerDetails();
        entertainment.shoeGames("indoor");
        entertainment.showActivity();

        System.out.println();

        entertainment=new DeveloperDetails();
        entertainment.shoeGames("outdoor");
        entertainment.showActivity();
    }
}
