package com.util.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerMain {
    public static void main(String[] args) {

        List<Customer> customerList=new ArrayList<>();

        Customer customer1=new Customer("Hemu",11,"Mandya");
        customerList.add(customer1);
        customerList.add(new Customer("Kushu",12,"KGF"));
        customerList.add(new Customer("Nithi",14,"Kadapa"));
        customerList.add(new Customer("Priya",15,"Davanagere"));
        customerList.add(new Customer("Adarsh",16,"Hasan"));
        customerList.add(new Customer("Vinu",17,"Mandya"));


        List<Customer> customerByCity=new ArrayList<>();

        for(Customer customer:customerList){
            System.out.println(customer);
        }

        for (Customer customer:customerList){
            if(customer.getCity().equals("Mandya")){
                customerByCity.add(customer);
            }
        }
        System.out.println("==========");

        System.out.println("The common city peoples are");
        for (Customer city:customerByCity){
            System.out.println(city);
        }
    }
}
