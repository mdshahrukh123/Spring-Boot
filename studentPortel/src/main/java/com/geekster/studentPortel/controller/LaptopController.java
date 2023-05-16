package com.geekster.studentPortel.controller;

import com.geekster.studentPortel.model.Course;
import com.geekster.studentPortel.model.Laptop;
import com.geekster.studentPortel.model.Student;
import com.geekster.studentPortel.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class LaptopController {
    @Autowired
    LaptopService laptopService;
    @PostMapping(value = "/laptop")
    public String AddLaptop(@RequestBody List<Laptop> laptopList){

        return laptopService.addLaptop(laptopList);
    }

    @GetMapping(value = "/laptop")
    public Iterable<Laptop> getAllLaptop(){
        return laptopService.getLaptop();
    }
}
