package com.geekster.restaurantApp.controller;

import com.geekster.restaurantApp.model.Post;
import com.geekster.restaurantApp.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/post")
public class PostController {
    @Autowired
    PostService postService;

    @PostMapping(value= "/addPost")
     String savePost(@RequestBody Post post){
        return postService.savePost(post);
    }

    @GetMapping(value = "/seePost")
    List<Post> getPosts(){
        return postService.getPost();
    }
}
