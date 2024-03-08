package com.objects.overriding;

public class Indian extends Menu{
    @Override
    void showItems(String type) {
        if(type.equals("breakfast")){
            System.out.println("Belluli kabab");
            System.out.println("Chicken Kabab");
            System.out.println("Lemon Chicken");
            System.out.println("Idli leg soup");
            System.out.println("Boti");
        } else if (type.equals("lunch")) {
            System.out.println("Mutton biriyani");
            System.out.println("Chicken biriyani");
            System.out.println("Mudde Nati koli");
        }else {
            System.out.println("Rasagulla");
            System.out.println("Barfi");
        }
    }
}
