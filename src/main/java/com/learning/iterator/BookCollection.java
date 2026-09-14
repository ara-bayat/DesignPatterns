package com.learning.iterator;

public interface BookCollection {
    Iterator<Book> createIterator();
    void addBook(Book book);
}