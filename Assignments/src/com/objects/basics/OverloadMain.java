package com.objects.basics;

import java.util.Scanner;

public class OverloadMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee []empList = new Employee[3];

        for(int i=0;i<empList.length;i++){
            System.out.println("Enter the employee name and designation: ");
            String name = sc.next();
            String designation = sc.next();
            empList[i]=new Employee(name,designation);
        }
        System.out.println("Enter your choice : Manager or Programmer or Director");
        String choice = sc.next();
        for(Employee emp:empList) {

                if (choice.equals("Programmer")) {
                    emp.calcBonus(25000);
                } else if (choice.equals("Manager")) {
                    emp.calcBonus(27000, 6000, "Car");
                } else {
                    emp.calcBonus(30000, "Laptop", 8000, 3000);
                }
            }

    }
}
