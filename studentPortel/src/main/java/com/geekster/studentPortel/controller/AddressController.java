package com.geekster.studentPortel.controller;

import com.geekster.studentPortel.model.Address;
import com.geekster.studentPortel.model.Student;
import com.geekster.studentPortel.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping(value = "/address")
    public String AddAddress(@RequestBody List<Address> addressList){
        return addressService.addStudent(addressList);
    }

    @GetMapping(value = "/address")
    public Iterable<Address> getAllAddress(){
        return addressService.getAddress();
    }
}
