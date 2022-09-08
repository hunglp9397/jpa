package com.hunglp.example.ex_2.repository;


import com.hunglp.example.ex_2.entity.Author;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {


    @EntityGraph(attributePaths = {"books"})
    List<Author> findAll();
}
