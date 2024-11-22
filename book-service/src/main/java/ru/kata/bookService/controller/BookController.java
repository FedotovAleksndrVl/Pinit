package ru.kata.bookService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kata.bookService.model.Book;
import ru.kata.bookService.service.BookServiceImpl;

@Controller
public class BookController {

    final private BookServiceImpl bookService;

    @Autowired
    public BookController(BookServiceImpl bookService) {
        this.bookService = bookService;
    }

    @GetMapping(value = { "/index"})
    public String index() {
        bookService.saveBook(new Book(1, "q", "w", "e"));
        return "ок";
    }
}