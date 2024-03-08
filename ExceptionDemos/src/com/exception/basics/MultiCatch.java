package com.exception.basics;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            System.out.println("Welcome");
            String value = args[0];
            System.out.println("Value " + value);
            int num = Integer.parseInt(value);
            System.out.println("Number " + num);
            int result = 100 / num;
            System.out.println(result);
            int marks[]=null;
            System.out.println(marks[0]);
        }catch (ArrayIndexOutOfBoundsException |
                NullPointerException |
                NumberFormatException |
                ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Please enter a number");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Completed");
    }
}
