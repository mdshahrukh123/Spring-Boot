package com.geekster.studentPortel.service;

import com.geekster.studentPortel.model.Book;
import com.geekster.studentPortel.repository.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    IBookRepo bookRepo;
    public String addBook(List<Book> bookList) {
        Iterable<Book> bookStatus = bookRepo.saveAll(bookList);
        if(bookStatus != null){
            return "Yes !!!!....";
        }else{
            return "no !!!...";
        }
    }

    public Iterable<Book> getBook() {
        return bookRepo.findAll();
    }
}
