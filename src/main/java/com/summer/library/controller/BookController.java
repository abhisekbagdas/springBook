package com.summer.library.controller;

import com.summer.library.dao.BookDAO;
import com.summer.library.models.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class BookController {


    @GetMapping("/books")
    public ArrayList<Book> getBooks() {
        BookDAO bookdao = new BookDAO();
        return bookdao.getBooks();
    }


    @PostMapping("/books")
    public void storeBook(@RequestBody Book book){
        BookDAO bookdao = new BookDAO( );
        bookdao.insertBook(book);
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
