package com.util.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenDemo {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(11,24,5,60,90,54);

        List<Integer> evenList=new ArrayList<>();

        for (Integer even:numbers){
            if (even%2==0){
                evenList.add(even);
            }
        }

        for (Integer evenNumber:evenList){
            System.out.println(evenNumber);
        }
    }
}
