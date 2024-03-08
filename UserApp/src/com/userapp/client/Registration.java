package com.userapp.client;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;
import com.userapp.service.IValidationService;
import com.userapp.service.ValidationServiceImpl;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user name:");
        String un=sc.next();
        IValidationService validationService=new ValidationServiceImpl();
        try {
            if (validationService.validateUserName(un)) {
                System.out.println("Welcome user ");
                System.out.println("Enter password:");
                String pwd=sc.next();
                if(validationService.validatePassword(pwd))
                    System.out.println("Welcome "+un+" you are registered");
            }
        }  catch (NameExistsException e){
            System.out.println(e.getMessage());
        }catch (TooLongException | TooShortException e) {
            System.out.println(e.getMessage());
        }
    }
}
