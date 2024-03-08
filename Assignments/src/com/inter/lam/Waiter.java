package com.inter.lam;

public class Waiter {
    void availableItems(IMenu menu){
        System.out.println("Welcome to my hotel");
        menu.showMenu();
        System.out.println("Order Now");
    }
}
