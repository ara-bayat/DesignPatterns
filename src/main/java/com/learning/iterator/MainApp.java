package com.learning.iterator;

public class MainApp {
    public static void main(String[] args) {
        BookShelf shelf = new BookShelf();
        shelf.addBook(new Book("کلیات سعدی", "سعدی شیرازی"));
        shelf.addBook(new Book("مثنوی معنوی", "مولانا"));
        shelf.addBook(new Book("شاهنامه", "فردوسی"));

        // پیمایش با Iterator
        Iterator<Book> iterator = shelf.createIterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book);
        }
    }
}
