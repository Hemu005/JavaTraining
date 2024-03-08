package com.objects.overriding;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu menu=new Chinese();
        menu.showItems("starters");

        menu = new Indian();
        menu.showItems("breakfast");

        Chinese chinese=(Chinese) menu;
        chinese.printGames();
    }
}
