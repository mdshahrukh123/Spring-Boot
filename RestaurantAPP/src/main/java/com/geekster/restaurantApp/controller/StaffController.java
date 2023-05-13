package com.geekster.restaurantApp.controller;


import com.geekster.restaurantApp.dto.SignInInput;
import com.geekster.restaurantApp.dto.SignInOutput;
import com.geekster.restaurantApp.dto.SignUpInput;
import com.geekster.restaurantApp.dto.SignUpOutput;
import com.geekster.restaurantApp.model.AppointmentKey;
import com.geekster.restaurantApp.model.Food;
import com.geekster.restaurantApp.service.AuthenticationService;
import com.geekster.restaurantApp.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    StaffService patientService;


    @Autowired
    AuthenticationService authService;

    //sign up

    // sign up input
    //sign up output
    @PostMapping("/signup")
    public SignUpOutput signup(@RequestBody SignUpInput signUpDto)
    {
        return patientService.signUp(signUpDto);
    }

    //sign in

    @PostMapping("/signin")
    public SignInOutput signup(@RequestBody SignInInput signInDto)
    {
        return patientService.signIn(signInDto);
    }

    @GetMapping("/staff")
    public ResponseEntity<List<Food>> getAllDoctors(@RequestParam String userEmail, @RequestParam String token)
    {
        HttpStatus status;
        List<Food> allDoctors = null;
        //authenticate

        //token : calculate token -> find email in Db corr to this token-> match the emails
        if(authService.authenticate(userEmail,token))
        {

            allDoctors =  patientService.getAllDoctors();
            status = HttpStatus.OK;
        }
        else
        {
            status = HttpStatus.FORBIDDEN;
        }



        return new ResponseEntity<List<Food>>(allDoctors, status);
    }


    //todo : move the create appointment in Appointment controller in here along with authentication...!

    //delete my appointment :

    @DeleteMapping("appointment")
    ResponseEntity<Void> cancelAppointment(@RequestParam String userEmail, @RequestParam String token, @RequestBody AppointmentKey key)
    {

        HttpStatus status;
        if(authService.authenticate(userEmail,token))
        {
            patientService.cancelAppointment(key);
            status = HttpStatus.OK;
        }
        else
        {
            status = HttpStatus.FORBIDDEN;
        }

        return new ResponseEntity<Void>(status);

    }




}
