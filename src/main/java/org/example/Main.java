package org.example;

import java.util.List;
public class Main {
    public static void main(String[] args) {
        BookHelper bookHelper = new BookHelper();
        Book book1 = new Book();
        book1.setId(1);
        book1.setName("Murder on the Orient Express");
        book1.setAuthor_id(1);
        Book book2 = new Book();
        book2.setId(2);
        book2.setName("And Then There Were None");
        book2.setAuthor_id(1);
        Book book3 = new Book();
        book3.setId(3);
        book3.setName("The source");
        book3.setAuthor_id(2);

        bookHelper.addBook(book1);
        bookHelper.addBook(book2);
        bookHelper.addBook(book3);

        System.out.println("------------------");
        System.out.println(bookHelper.getBookById(2).getName());
        System.out.println("----------------");
        List<Book> bookList = bookHelper.getBookList();
        for (Book book : bookList) {
            System.out.println(book.getName());
        }


    }
}