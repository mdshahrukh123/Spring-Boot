package com.geekster.restaurantApp.controller;


import com.geekster.restaurantApp.model.Order;
import com.geekster.restaurantApp.model.Food;
import com.geekster.restaurantApp.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    FoodService docService;

    @PostMapping()
    void addDoctors(@RequestBody Food doc)
    {
        docService.addDoc(doc);
    }

    @GetMapping("{foodId}/order")
    ResponseEntity<List<Order>> getFoodMenu(@PathVariable Long docId)
    {

        List<Order> myAppointments = null;
        HttpStatus status;
        try
        {
            myAppointments = docService.getMyAppointments(docId);
            //System.out.println(myAppointments);
            if(myAppointments.isEmpty())
            {
                status = HttpStatus.NO_CONTENT;
            }
            else
            {
                status = HttpStatus.OK;
            }
        }
        catch(Exception e)
        {
            System.out.println("The doc Id is not valid");
            status = HttpStatus.BAD_REQUEST;

        }

        return new ResponseEntity<List<Order>>(myAppointments,status);

    }


}
