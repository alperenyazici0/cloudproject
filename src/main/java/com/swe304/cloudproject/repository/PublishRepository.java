package com.swe304.cloudproject.repository;

import com.swe304.cloudproject.model.Publish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublishRepository extends JpaRepository<Publish, Integer> {
}