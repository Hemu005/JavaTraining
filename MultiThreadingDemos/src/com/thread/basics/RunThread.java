package com.thread.basics;

class Runner implements Runnable{
    String name;
    Greetings greetings;
    public Runner(String name, Greetings greetings){
        Thread thread=new Thread(this,name);
        this.name=name;
        this.greetings=greetings;
        thread.start();
    }
    @Override
    public void run() {
        synchronized (greetings){
        System.out.println(greetings.sayHello(name));
        System.out.println("done");
    }}

}

public class RunThread {
    public static void main(String[] args) {
        Greetings greetings=new Greetings();
        Runner runner1=new Runner("Ram",greetings);
        Runner runner2=new Runner("Tom",greetings);
        Runner runner3=new Runner("Sam",greetings);
        Runner runner4=new Runner("John",greetings);
      /*  Thread thread1=new Thread(runner,"Thread-one");
        Thread thread2=new Thread(runner,"Thread-two");

        thread1.start();
        thread2.start();*/
    }
}
