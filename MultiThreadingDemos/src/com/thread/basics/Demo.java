package com.thread.basics;

public class Demo {
    public static void main(String[] args) {

        Runnable task=()-> {
            System.out.println("task1");
        };
        Thread thread=new Thread(task,"pop");
        Thread thread1=new Thread(()->{
            System.out.println("task2");
        },"top");
        thread.start();
        thread1.start();
    }
}
