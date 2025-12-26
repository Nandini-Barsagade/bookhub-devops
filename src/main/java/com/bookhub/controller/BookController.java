package com.bookhub.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.bookhub.model.Book;
import com.bookhub.service.BookService;
@RestController
@RequestMapping("/books")
public class BookController {
@Autowired
private BookService service;
@GetMapping
public List<Book> getBooks(){
return service.getAllBooks();
}
@PostMapping
public Book addBook(@RequestBody Book book){
return service.saveBook(book);
}
}