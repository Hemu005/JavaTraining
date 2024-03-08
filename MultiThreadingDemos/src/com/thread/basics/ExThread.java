package com.thread.basics;

class Child extends Thread{
    //this is the CPU
     public Child(String name,int priority){
         super(name);
         System.out.println(this);
         //this.start();
     }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
     for (int i=1;i<=10;i++)
         System.out.println("5 * "+i+" ="+(5*i));
         try {
         Thread.sleep(2000);
     }catch (InterruptedException e){
             e.printStackTrace();
         }
    }
}

public class ExThread {
    public static void main(String[] args) {
    /*    Child child=new Child("King",1);
        child.setName("thread-one");
        System.out.println(child);
        child.start();

        Child child1=new Child("Queen",2);
        child.setName("thread-one");
        System.out.println(child1);
        child1.start();*/

       // Child child=new Child("Thread-one",1);
        //Child child1=new Child("Thread-two",3);
        Child child2=new Child("Thread-three",4);
        child2.setDaemon(true);
        child2.start();
        System.out.println();
        for (int i=1;i<=10;i++)
            System.out.println("5 * "+i+" ="+(5*i));
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        /*try {
            child.join();
            child1.join();
            child2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }*/
        System.out.println("Main Completed");
    }
    }

