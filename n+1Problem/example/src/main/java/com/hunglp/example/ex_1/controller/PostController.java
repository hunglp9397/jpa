package com.hunglp.example.ex_1.controller;


import com.hunglp.example.ex_1.entity.Post;
import com.hunglp.example.ex_1.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PostController {

    @Autowired
    private PostRepository postRepository;



    @GetMapping("/post")
    public List<Post> getPost(){
        return postRepository.findAll();

//        return postRepository.getALlPosts();
    }
}
