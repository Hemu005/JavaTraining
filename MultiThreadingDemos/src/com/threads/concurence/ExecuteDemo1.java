package com.threads.concurence;

import com.thread.basics.Booking;
import com.thread.basics.Greetings;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteDemo1 {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        //creating independent tasks
        executorService.execute(()->{
            System.out.println("Doing pooling");
            //call Greeting class
            Greetings greet=new Greetings();
            greet.sayHello("Hemu");
        });
        executorService.execute(()->{
            //call the task of booking tickets
            System.out.println("Executing name from url");
            Booking booking=new Booking();
            System.out.println(booking.bookTickets("Gowda",15));
        });
        executorService.execute(()->{
            System.out.println("Reading from DB");
            //call the method of DbConnector class
        });
    }
}
