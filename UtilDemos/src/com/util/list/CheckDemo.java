package com.util.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CheckDemo {
    public static void main(String[] args) {
    List<String> fruits=new ArrayList<>();

    fruits.add("Apple");
    fruits.add("Mango");
    fruits.add("Grapes");
    fruits.add("Orange");
    fruits.add("Pine Apple");
    fruits.add("Butter fruit");

    List<String> appleList=new ArrayList<>();

    for(String fruit:fruits){
        if(fruit.toLowerCase().contains("apple")){
            appleList.add(fruit);
        }
    }

    for (String apple:appleList){
        System.out.println(apple);
    }
}}

