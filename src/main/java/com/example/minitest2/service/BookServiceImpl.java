package com.example.minitest2.service;

import com.example.minitest2.model.Book;
import com.example.minitest2.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements IBookService {

    @Autowired
    BookRepo BookRepo;

    @Override
    public List<Book> findAll() {
        return BookRepo.findAll();
    }

    @Override
    public void saveBook(Book book) {
        BookRepo.save(book);
    }

    @Override
    public void deleteBook(Long id) {
        BookRepo.deleteById(id);
    }

    @Override
    public Book findById(Long id) {
        return BookRepo.findById(id).get();
    }
}
