package com.swe304.cloudproject.repository;

import com.swe304.cloudproject.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {}
