package com.learning.iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements BookCollection {
    private final List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public Iterator<Book> createIterator() {
        return new BookShelfIterator(this.books);
    }

    // ========== Concrete Iterator (داخلی) ==========
    private static class BookShelfIterator implements Iterator<Book> {
        private final List<Book> books;
        private int position = 0;

        public BookShelfIterator(List<Book> books) {
            this.books = books;
        }

        @Override
        public boolean hasNext() {
            return position < books.size();
        }

        @Override
        public Book next() {
            if (!hasNext()) {
                throw new IndexOutOfBoundsException("کتاب دیگری وجود ندارد!");
            }
            return books.get(position++);
        }
    }
}