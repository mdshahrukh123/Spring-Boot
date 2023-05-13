package com.geekster.restaurantApp.service;


import com.geekster.restaurantApp.model.Order;
import com.geekster.restaurantApp.model.AppointmentKey;
import com.geekster.restaurantApp.repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    IOrderRepo appointmentRepo;

    public void bookAppointment(Order appointment) {
        appointmentRepo.save(appointment);
    }

    public void cancelAppointment(AppointmentKey key) {
        appointmentRepo.deleteById(key);
    }
}
