package com.swe304.cloudproject.controller;

import com.swe304.cloudproject.model.Publish;
import com.swe304.cloudproject.repository.PublishRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/publishes")
public class PublishController {
    private final PublishRepository publishRepository;

    public PublishController(PublishRepository publishRepository) {
        this.publishRepository = publishRepository;
    }

    @GetMapping
    public List<Publish> getAllPublishes() {
        return publishRepository.findAll();
    }

    @PostMapping
    public Publish createPublish(@RequestBody Publish publish) {
        return publishRepository.save(publish);
    }
}