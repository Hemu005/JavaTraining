package com.inter.lam;

public class UserMain {
    public static void main(String[] args) {
        Waiter waiter=new Waiter();

        waiter.availableItems(()-> {
                System.out.println("Indian----->");
        System.out.println("Masala Dosa");
        System.out.println("Idly");
        });
    }
}
