package com.geekster.studentPortel.service;

import com.geekster.studentPortel.model.Address;
import com.geekster.studentPortel.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;
    public String addStudent(List<Address> addressList) {
        Iterable<Address> addressStatus = addressRepo.saveAll(addressList);

        if(addressStatus != null){
            return "Yes Added !!!....";
        }else{
            return "No !!!!....";
        }
    }

    public Iterable<Address> getAddress() {

        return addressRepo.findAll();
    }
}
