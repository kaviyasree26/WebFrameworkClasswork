package com.example2.cw2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example2.cw2.model.Book;
import com.example2.cw2.repository.BookRepo;

@Service
public class BookService 
{
     @Autowired
     private BookRepo bookRepo;
     
     public Book saveBook(Book book)
     {
        return bookRepo.save(book);
     }

     public Book findBook(int id)
     {
        return bookRepo.findById(id).orElse(null);
     }

     public List<Book> getAllBooks()
     {
        return bookRepo.findAll();
     }

}
