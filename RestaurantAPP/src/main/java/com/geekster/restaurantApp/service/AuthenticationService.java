package com.geekster.restaurantApp.service;


import com.geekster.restaurantApp.model.AuthenticationToken;
import com.geekster.restaurantApp.model.Staff;
import com.geekster.restaurantApp.repository.ITokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    ITokenRepo iTokenRepo;

    public void saveToken(AuthenticationToken token)
    {
        iTokenRepo.save(token);
    }

    public AuthenticationToken getToken(Staff patient) {
       return  iTokenRepo.findByPatient(patient);

    }

    public boolean authenticate(String userEmail, String token) {

         AuthenticationToken authToken = iTokenRepo.findFirstByToken(token);//find token object via token string
         String expectedEmail = authToken.getPatient().getPatientEmail();
         return expectedEmail.equals(userEmail);

    }
}
