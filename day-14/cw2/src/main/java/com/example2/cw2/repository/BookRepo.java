package com.example2.cw2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example2.cw2.model.Book;

public interface BookRepo extends JpaRepository<Book,Integer>
{
    
}
