package com.geekster.restaurantApp.controller;


import com.geekster.restaurantApp.model.Order;
import com.geekster.restaurantApp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class

OrderController {

    @Autowired
    OrderService appointmentService;

    @PostMapping()
    public void bookAppointment(@RequestBody Order appointment)
    {
        appointmentService.bookAppointment(appointment);
    }



}
