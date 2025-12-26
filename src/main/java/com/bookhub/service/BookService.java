package com.bookhub.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bookhub.model.Book;
import com.bookhub.repository.BookRepository;
@Service
public class BookService {
@Autowired
private BookRepository repo;
public List<Book> getAllBooks(){
return repo.findAll();
}
public Book saveBook(Book book){
return repo.save(book);
}
}