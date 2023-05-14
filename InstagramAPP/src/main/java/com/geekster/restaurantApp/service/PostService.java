package com.geekster.restaurantApp.service;

import com.geekster.restaurantApp.model.Post;
import com.geekster.restaurantApp.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    PostRepo postRepo;
    public String savePost(Post post) {
       Boolean status =  postRepo.addPost(post);
       if(status){
           return "Post Successfully Added !!!....";
       }
       else{
           return "Post Not Added !!!1...";
       }
    }

    public List<Post> getPost() {
        return postRepo.gatePost();
    }
}
