package com.geekster.restaurantApp.repository;

import com.geekster.restaurantApp.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepo {
    
    static List<User> userList= new ArrayList<>();
    public User findFirstByPatientEmail(String userEmail) {
        return User;
    }

    public void save(UserRepo userRepo) {
    }


}
