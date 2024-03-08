package com.objects.stat;

public class Trail {
    static int x;
    static int y=10;
    static {
        System.out.println("In static block");
    }
    static {
        System.out.println("In static block2");
        x=200;
    }
    static  void getMessage(){
        System.out.println("In static method");
        System.out.println("Sum :"+(x+y));
    }

    public static void main(String[] args) {
        System.out.println("In main");
        getMessage();
        System.out.println("Sum :"+(x+y));
    }
}
