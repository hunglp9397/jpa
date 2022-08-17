package com.hunglp.example.ex_2.repository;


import com.hunglp.example.ex_1.entity.Post;
import com.hunglp.example.ex_2.entity.Product;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @EntityGraph(attributePaths = {"stores"}, type = EntityGraph.EntityGraphType.LOAD)
    List<Product> findAll();
}