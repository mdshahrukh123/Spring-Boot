package com.geekster.restaurantApp.service;

import com.geekster.restaurantApp.dto.SignInInput;
import com.geekster.restaurantApp.dto.SignInOutput;
import com.geekster.restaurantApp.dto.SignUpInput;
import com.geekster.restaurantApp.dto.SignUpOutput;
import com.geekster.restaurantApp.model.User;
import com.geekster.restaurantApp.repository.UserRepo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Data
@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    public SignUpOutput signUp(SignUpInput signUpDto) {
        User user = userRepo.findFirstByPatientEmail(signUpDto.getUserEmail());

        if(user != null)
        {
            throw new IllegalStateException("Patient already exists!!!!...sign in instead");
        }


        //encryption
        String encryptedPassword = null;


        //save the user



        userRepo.save(userRepo);

        //token creation and saving



        return new SignUpOutput("Patient registered","Patient created successfully");


    }

    public SignInOutput signIn(SignInInput signInDto) {
        User user = userRepo.findFirstByPatientEmail(signInDto.getPatientEmail());

        if(user == null)
        {
            throw new IllegalStateException("User invalid!!!!...sign up instead");
        }
         return signInOutput;
    }
}
