package ru.kata.bookService.service;

import ru.kata.bookService.model.Book;

import java.util.List;

public interface BookService {

    void saveBook(Book book);

    List<Book> getAllBooks();

}
