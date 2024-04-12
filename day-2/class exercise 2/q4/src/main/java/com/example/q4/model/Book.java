package com.example.q4.model;

import java.time.LocalDate;

public class Book {
    
    String title;
    String author;
    LocalDate pubdate;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public LocalDate getPubdate() {
        return pubdate;
    }
    public void setPubdate(LocalDate pubdate) {
        this.pubdate = pubdate;
    }
    
}
