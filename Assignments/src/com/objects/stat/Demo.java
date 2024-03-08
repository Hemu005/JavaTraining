package com.objects.stat;

import com.sun.jdi.ClassNotLoadedException;

public class Demo {
    static {
        System.out.println("In demo static block");
    }
    public static void main(String[] args) {
        System.out.println("main demo");

        try{
            Class.forName("com.objects.stat.Trail");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
