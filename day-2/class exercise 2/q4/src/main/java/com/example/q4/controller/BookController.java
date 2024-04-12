package com.example.q4.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.q4.model.Book;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class BookController {
    @GetMapping("/book")
    public Object getObject()
     {
        Book book=new Book();
        book.setTitle("The Great Soldier");
        book.setAuthor("G.Gyan");
        LocalDate date=LocalDate.now();
        book.setPubdate(date);
        return book;
     }
    
}
