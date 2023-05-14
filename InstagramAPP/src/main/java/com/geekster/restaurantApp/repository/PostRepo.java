package com.geekster.restaurantApp.repository;

import com.geekster.restaurantApp.model.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostRepo {

    static List<Post> postList = new ArrayList<>();
    public Boolean addPost(Post post) {
        postList.add(post);
        return true;
    }

    public List<Post> gatePost() {
        return postList;
    }
}
