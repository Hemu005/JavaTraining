package com.thread.basics;

public class Booking {
    public double bookTickets(String name,int noOfTickets){
        double costPerTickets=200;
        System.out.println("Booked for "+name);
        double totalPrice=costPerTickets*noOfTickets;
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Total "+totalPrice);
        return totalPrice;
    }
}
