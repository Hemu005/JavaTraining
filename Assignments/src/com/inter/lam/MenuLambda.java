package com.inter.lam;

public class MenuLambda {
    public static void main(String[] args) {
        IMenu iMenu=()->{
            System.out.println("Chinese----->");
            System.out.println("Gobi");
            System.out.println("Noodles");
        };
        iMenu.showMenu();
        iMenu=()->{
            System.out.println("Indian----->");
            System.out.println("Masala Dosa");
            System.out.println("Idly");
        };
        iMenu.showMenu();
        iMenu=()->{
            System.out.println("Italian----->");
            System.out.println("Italian mini meal");
        };
        iMenu.showMenu();
}}
