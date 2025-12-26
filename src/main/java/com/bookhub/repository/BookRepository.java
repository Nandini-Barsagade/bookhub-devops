package com.bookhub.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.bookhub.model.Book;
public interface BookRepository extends JpaRepository<Book,Integer>{}