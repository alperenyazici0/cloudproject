package com.swe304.cloudproject.controller;

import com.swe304.cloudproject.model.Publish;
import com.swe304.cloudproject.repository.PublishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/publishes")
public class PublishController {
    @Autowired
    private PublishRepository repo;

    @GetMapping
    public List<Publish> getAll() { return repo.findAll(); }

    @PostMapping
    public Publish create(@RequestBody Publish p) { return repo.save(p); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { repo.deleteById(id); }
}