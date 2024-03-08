package com.oops.overloading;

public class VarargsDemo {
    void calcSum(String name,int... marks){
        System.out.println("Welcome :"+name);
        int sum=0;
        for(int mark:marks){
            sum += mark;
        }
        System.out.println("Sum :"+sum);
    }

    void calcSum(String name){
        System.out.println("Hello :"+name);
    }

    public static void main(String[] args) {
        VarargsDemo demo = new VarargsDemo();
        demo.calcSum("Hemu",90,80,90);
        demo.calcSum("Gowda");
        demo.calcSum("Roni",90,80);
    }
}
