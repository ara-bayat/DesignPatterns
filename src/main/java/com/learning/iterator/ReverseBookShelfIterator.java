package com.learning.iterator;

import java.util.List;

public class ReverseBookShelfIterator implements Iterator<Book> {
    private final List<Book> books;
    private int position;

    public ReverseBookShelfIterator(List<Book> books) {
        this.books = books;
        this.position = books.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return position >= 0;
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new IndexOutOfBoundsException("کتاب دیگری وجود ندارد!");
        }
        return books.get(position--);
    }
}
