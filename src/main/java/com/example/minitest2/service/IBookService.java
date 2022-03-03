package com.example.minitest2.service;

import com.example.minitest2.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAll();

    void saveBook(Book book);

    void deleteBook(Long id);

    Book findById(Long id);
}
