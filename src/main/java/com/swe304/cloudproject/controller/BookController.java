package com.swe304.cloudproject.controller;

import com.swe304.cloudproject.model.Book;
import com.swe304.cloudproject.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    private BookRepository repo;

    @GetMapping
    public List<Book> getAll() { return repo.findAll(); }

    @PostMapping
    public Book create(@RequestBody Book b) { return repo.save(b); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { repo.deleteById(id); }
}