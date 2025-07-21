package com.summer.library.controller;

import com.summer.library.dao.BookDAO;
import com.summer.library.models.Book;

import java.util.ArrayList;

public class BookController {

    public void storeBook(Book book){
        BookDAO bookdao = new BookDAO();
        bookdao.insertBook(book);
    }

    public ArrayList<Book> getBooks() {
        BookDAO bookdao = new BookDAO();
        return bookdao.getBooks();
    }

    public void updateBook(int bookid, int bookNumber) {
        BookDAO bookdao = new BookDAO();
        bookdao.updateBookDetail(bookid, bookNumber);
    }

    public void deleteBook(int bookid) {
        BookDAO bookdao = new BookDAO();
        bookdao.deleteBookDetail(bookid);
    }
}
