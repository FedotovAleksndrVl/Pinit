package ru.kata.bookService.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.kata.bookService.model.Book;

public interface BookRepository extends MongoRepository<Book, String> {
    // дополнительные методы запроса
}
