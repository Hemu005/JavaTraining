package com.oops.basics;

public class EmpMain {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        Employee emp=new Employee("Hemu",04,20000);

        System.out.println(emp.greet("Employee details"));
        emp.getDetails();

    }
}
