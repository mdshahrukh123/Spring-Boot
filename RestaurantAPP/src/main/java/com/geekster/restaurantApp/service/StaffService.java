package com.geekster.restaurantApp.service;


import com.geekster.restaurantApp.dto.SignInInput;
import com.geekster.restaurantApp.dto.SignInOutput;
import com.geekster.restaurantApp.dto.SignUpInput;
import com.geekster.restaurantApp.dto.SignUpOutput;
import com.geekster.restaurantApp.model.AppointmentKey;
import com.geekster.restaurantApp.model.AuthenticationToken;
import com.geekster.restaurantApp.model.Food;
import com.geekster.restaurantApp.model.Staff;
import com.geekster.restaurantApp.repository.IStaffRepo;
import jakarta.xml.bind.DatatypeConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@Service
public class StaffService {

    @Autowired
    IStaffRepo iPatientRepo;


    @Autowired
    AuthenticationService tokenService;

    @Autowired
    OrderService appointmentService;

    @Autowired
    FoodService doctorService;

    public SignUpOutput signUp(SignUpInput signUpDto) {

        //check if user exists or not based on email
        Staff patient = iPatientRepo.findFirstByPatientEmail(signUpDto.getUserEmail());

        if(patient != null)
        {
            throw new IllegalStateException("Patient already exists!!!!...sign in instead");
        }


        //encryption
        String encryptedPassword = null;
        try {
            encryptedPassword = encryptPassword(signUpDto.getUserPassword());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();

        }

        //save the user

        patient = new Staff(signUpDto.getUserFirstName(),
                signUpDto.getUserLastName(),signUpDto.getUserEmail(),
                encryptedPassword, signUpDto.getUserContact());

        iPatientRepo.save(patient);

        //token creation and saving

        AuthenticationToken token = new AuthenticationToken(patient);

        tokenService.saveToken(token);

        return new SignUpOutput("Patient registered","Patient created successfully");


    }

    private String encryptPassword(String userPassword) throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(userPassword.getBytes());
        byte[] digested =  md5.digest();

        String hash = DatatypeConverter.printHexBinary(digested);
        return hash;
    }


    public SignInOutput signIn(SignInInput signInDto) {

        //get email

        Staff patient = iPatientRepo.findFirstByPatientEmail(signInDto.getPatientEmail());

        if(patient == null)
        {
            throw new IllegalStateException("User invalid!!!!...sign up instead");
        }

        //encrypt the password

        String encryptedPassword = null;

        try {
            encryptedPassword = encryptPassword(signInDto.getPatientPassword());
        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();

        }



        //match it with database encrypted password

        boolean isPasswordValid = encryptedPassword.equals(patient.getPatientPassword());

        if(!isPasswordValid)
        {
            throw new IllegalStateException("User invalid!!!!...sign up instead");
        }

        //figure out the token

        AuthenticationToken authToken = tokenService.getToken(patient);

        //set up output response

        return new SignInOutput("Authentication Successfull !!!",authToken.getToken());


    }

    public List<Food> getAllDoctors() {
        return doctorService.getAllDoctors();
    }

    public void cancelAppointment(AppointmentKey key) {

        appointmentService.cancelAppointment(key);

    }
}
