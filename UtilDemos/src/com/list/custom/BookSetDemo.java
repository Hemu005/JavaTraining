package com.list.custom;

import java.util.*;

public class BookSetDemo {
    public static void main(String[] args) {
        List<Book> books= Arrays.asList(new Book("Java","Kathy",950),
                new Book("Spring","Robin",800),
                new Book("Spring","Robin",800),
                new Book("Angular","Zimmer",910),
                new Book("Spring","Robin",800),
                new Book("Sql","Rohan",740));

        System.out.println("List Book");
        for (Book book:books){
            System.out.println(book);
        }
        System.out.println();
        System.out.println("Set Books");
        Set<Book> bookSet=new TreeSet<>(books);
        for (Book book:bookSet){
            System.out.println(book);
        }
    }
}
