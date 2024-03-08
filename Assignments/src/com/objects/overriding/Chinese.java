package com.objects.overriding;

public class Chinese extends Menu{
    @Override
    void showItems(String type) {
        if(type.equals("starters")){
            System.out.println("Gobi Manchoori");
            System.out.println("Noodels");
        } else if (type.equals("lunch")) {
            System.out.println("Chinese Special");
            System.out.println("Chinese Combo");
        }else{
            System.out.println("Kova");
            System.out.println("Mysore pak");
    }}
    void printGames(){
        System.out.println("PubG");
    }
}
