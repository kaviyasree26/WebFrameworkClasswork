package com.example2.cw2.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example2.cw2.model.Book;
import com.example2.cw2.service.BookService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class BookController 
{
    private BookService bookService;
    public BookController(BookService bookService)
    {
        this.bookService=bookService;
    }
     @PostMapping("/api/book")
    public ResponseEntity<Object> postMethodBook(@RequestBody Book book) 
    {
        try 
        {
            Book savedBook = bookService.saveBook(book);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedBook);
        } catch (Exception e) 
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred: " + e.getMessage());
        }
    }

     @GetMapping("/api/book/{bookId}")
    public ResponseEntity<Object> getMethodBookId(@PathVariable("bookId") int id) {
        try {
            Book book = bookService.findBook(id);
            if (book == null) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Book not found for ID: " + id);
            } else {
                return ResponseEntity.status(HttpStatus.OK).body(book);
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred: " + e.getMessage());
        }
    }

     @GetMapping("/api/book")
    public ResponseEntity<Object> getMethodBook() {
        try {
            List<Book> books = bookService.getAllBooks();
            if (books.isEmpty()) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No books found.");
            } else {
                return ResponseEntity.status(HttpStatus.OK).body(books);
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred: " + e.getMessage());
        }
    }
    

    @PutMapping("/api/book/{id}")
    public ResponseEntity<Book> putMethodBook(@PathVariable int id, @RequestBody Book book) 
    {
        Book existBook=bookService.findBook(id);
        if(existBook!=null)
        {
            existBook.setAuthor(book.getAuthor());
            existBook.setAvailableCopies(book.getAvailableCopies());
            existBook.setTitle(book.getTitle());
            existBook.setTotalCopies(book.getTotalCopies());
            bookService.saveBook(existBook);
        }
        else
        {
         return new ResponseEntity<Book>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
         return new ResponseEntity<Book>(HttpStatus.OK);
    }


}
