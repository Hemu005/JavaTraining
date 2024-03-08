package com.list.custom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CompareMain {
    public static void main(String[] args) {

        List<Book> books= Arrays.asList(new Book("Java","Kathy",950),
                                        new Book("Spring","Robin",800),
                                        new Book("Angular","Zimmer",910),
                                        new Book("Sql","Rohan",740));

        System.out.println("Before comparing");
        for (Book cbook:books){
            System.out.println(cbook);
        }

        System.out.println("------------");

        System.out.println("After sorting");
        Collections.sort(books);
        for(Book sbook:books){
            System.out.println(sbook);
        }
    }
}
