package com.inter.lam;

public class AnonyDemo {
    public static void main(String[] args) {
        //using a class that implements the interface
        IGreeter greeter=new GreeterImpl();
        greeter.greetMessage("Lamba");

        IGreeter greeter1=new IGreeter() { //Anonymous inner class
            @Override
            public void greetMessage(String message) {
                System.out.println("Hlo "+message);
            }
        };
        //call the method
        greeter1.greetMessage("Kumba");
    }
}
