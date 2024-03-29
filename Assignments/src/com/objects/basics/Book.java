package com.objects.basics;

public class Book {
    String title;
    String author;
    double price;
    String category;

    public Book(String title, String author, double price, String category) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.category = category;
    }

    void getDetails(){
        System.out.println("Title :"+title);
        System.out.println("Author :"+author);
        System.out.println("Price :"+price);
        System.out.println("Category :"+category);
    }
    void checkBookType(){
        if(price>500){
            System.out.println("It is a Premium Book");
        }else{
            System.out.println("It is a Standard Book");
        }
    }
}
