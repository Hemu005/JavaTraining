package com.objects.basics;

public class Main {
    public static void main(String[] args) {
        Book book =new Book("Mankuthimma","DVG",900,"Fiction");
        book.getDetails();
        book.checkBookType();

        System.out.println();

        Book book1 =new Book("Moogana Maathu","Kuvempu",490,"Fiction");
        book1.getDetails();
        book1.checkBookType();

    }
}
