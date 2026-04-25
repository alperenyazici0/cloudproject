package com.swe304.cloudproject.controller;

import com.swe304.cloudproject.model.Author;
import com.swe304.cloudproject.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {
    @Autowired
    private AuthorRepository repo;

    @GetMapping
    public List<Author> getAll() { return repo.findAll(); }
    @PostMapping
    public Author create(@RequestBody Author a) { return repo.save(a); }
}