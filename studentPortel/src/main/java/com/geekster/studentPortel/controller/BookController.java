package com.geekster.studentPortel.controller;

import com.geekster.studentPortel.model.Book;
import com.geekster.studentPortel.model.Student;
import com.geekster.studentPortel.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;
    @PostMapping(value = "/book")
    public String AddBook(@RequestBody List<Book> bookList){
        return bookService.addBook(bookList);
    }

    @GetMapping(value = "/book")
    public Iterable<Book> getAllBook(){
        return bookService.getBook();
    }
}
