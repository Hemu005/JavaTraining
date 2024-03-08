package com.bookapp.service;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements IBookService{
    @Override
    public List<Book> findAll() {
        List<Book> books= BookDetails.showBooks();
        return books;
    }

    @Override
    public List<Book> findByAuthorStartsWith(String author) throws BookNotFoundException {
        List<Book> books=BookDetails.showBooks();
        List<Book> bookByStartsWith=new ArrayList<>();
        for (Book book:books){
            if(book.getAuthor().toLowerCase().contains(author)){
                bookByStartsWith.add(book);
            }
        }
        if(bookByStartsWith.isEmpty()){
            throw new BookNotFoundException("Book doesn't match with "+author+" author");
        }
        return bookByStartsWith;
    }

    @Override
    public List<Book> findByCategory(String category) throws BookNotFoundException {
        List<Book> books=BookDetails.showBooks();
        List<Book> bookByCategory=new ArrayList<>();
        for (Book book:books){
            if (book.getCategory().toLowerCase().equals(category)){
                bookByCategory.add(book);
            }
        }
        if(bookByCategory.isEmpty()){
            throw new BookNotFoundException("Book doesn't match with "+category+" category");
        }
        return bookByCategory;
    }

    @Override
    public List<Book> findByPriceLessThan(double price) throws BookNotFoundException {
        List<Book> books=BookDetails.showBooks();
        List<Book> bookByPrice=new ArrayList<>();
        for (Book book:books){
            if (book.getPrice()<(price)){
                bookByPrice.add(book);
            }
        }
        if(bookByPrice.isEmpty()){
            throw new BookNotFoundException("Book doesn't match with "+price+" price");
        }
        return bookByPrice;
    }

    @Override
    public List<Book> findByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
        List<Book> books= BookDetails.showBooks();
        List<Book> bookAuthorAndCategory=new ArrayList<>();
        for (Book book:books){
            if (book.getAuthor().toLowerCase().equals(author) && book.getCategory().toLowerCase().equals(category)){
                bookAuthorAndCategory.add(book);
            }
        }
        if(bookAuthorAndCategory.isEmpty()){
            throw new BookNotFoundException("Book doesn't match with "+author+" author and "+category+" category");
        }
        return bookAuthorAndCategory;
    }

    @Override
    public Book findById(int bookId) throws IdNotFoundException {
        List<Book> books=BookDetails.showBooks();
        for (Book book:books){
            if (book.getBookId()==bookId){
                return book;
            }
        }

        throw new IdNotFoundException("Book doesn't match with "+bookId);
    }

    @Override
    public void addBook(Book book) {

    }

    @Override
    public void updateBook(int bookId,double price) {

    }

    @Override
    public void deleteBook(int bookId) {

    }
}
