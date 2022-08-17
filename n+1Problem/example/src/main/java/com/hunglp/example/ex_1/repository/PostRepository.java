package com.hunglp.example.ex_1.repository;

import com.hunglp.example.ex_1.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {


    @Query(value = "select p from Post p left join fetch p.postComments pc",
            countQuery = "select count(p) from Post p left join fetch p.postComments pc")
    List<Post> getALlPosts();


}
