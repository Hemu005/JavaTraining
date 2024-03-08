package com.voterapp.client;

import com.voterapp.exception.NotEligibleException;
import com.voterapp.service.ElectionBoothServiceImpl;
import com.voterapp.service.IElectionBoothService;

import java.util.Scanner;

public class Voter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Age:");
        int age=sc.nextInt();

        System.out.println("Enter the locality:");
        String locality=sc.next();

        System.out.println("Enter the voter id number:");
        int vid=sc.nextInt();

        IElectionBoothService service=new ElectionBoothServiceImpl();

        try {
             if(service.checkEligibility(age,locality,vid)){
                 System.out.println("You are eligible");
             }
        } catch (NotEligibleException e) {
            System.out.println(e.getMessage());
        }
    }
}
