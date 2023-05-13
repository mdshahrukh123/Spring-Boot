package com.geekster.restaurantApp.service;

import com.geekster.restaurantApp.model.Order;
import com.geekster.restaurantApp.model.Food;
import com.geekster.restaurantApp.repository.IFoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FoodService {

    @Autowired
    IFoodRepo doctorRepo;

    public void addDoc(Food doc) {
        doctorRepo.save(doc);
    }

    public List<Food> getAllDoctors() {
        List<Food> allDoctors = doctorRepo.findAll();
        return allDoctors;

    }

    public List<Order> getMyAppointments(Long docId) {

        Food myDoc = doctorRepo.findByDoctorId(docId);

        if(myDoc == null)
        {
            throw new IllegalStateException("The doctor does not exist");
        }

        return myDoc.getAppointments();
    }
}
