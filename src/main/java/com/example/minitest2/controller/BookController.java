package com.example.minitest2.controller;


import com.example.minitest2.model.Book;
import com.example.minitest2.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/books")
public class BookController {

    @Autowired
    IBookService iBookService;

    @GetMapping
    public ResponseEntity<List<Book>> findAll() {
        return new ResponseEntity<>(iBookService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<List<Book>> saveTour(@RequestBody Book book) {
        iBookService.saveBook(book);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<Book>> deleteTour(@PathVariable Long id) {
        iBookService.deleteBook(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @PutMapping
    public ResponseEntity<List<Book>> editTour(@RequestBody Book book) {
        iBookService.saveBook(book);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<Book>> detailTour(@PathVariable Long id) {
        Book book =  iBookService.findById(id);
        return new ResponseEntity( book, HttpStatus.OK);
    }


}
