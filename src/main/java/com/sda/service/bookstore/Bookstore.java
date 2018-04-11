package com.sda.service.bookstore;

import java.util.ArrayList;
import java.util.List;

public class Bookstore {
    private final List<Book> books;

    public Bookstore(List<Book> books) {
        this.books = new ArrayList<>();
    }

    public Bookstore() {
        this.books = new ArrayList<>();
    }




    public void add(Book book){
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void updateTitle(Book book, String titkle){
        Book bookInBookstore = books.get(books.indexOf(book));
        bookInBookstore.setTitle(titkle);
    }
}
