package com.geekster.studentPortel.service;

import com.geekster.studentPortel.model.Laptop;
import com.geekster.studentPortel.repository.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    @Autowired
    ILaptopRepo laptopRepo;
    public String addLaptop(List<Laptop> laptopList) {
        Iterable<Laptop> laptopStatus = laptopRepo.saveAll(laptopList);
        if(laptopStatus != null){
            return "yes !!!...";
        }else{
            return "No !!!....";
        }
    }

    public Iterable<Laptop> getLaptop() {
        return laptopRepo.findAll();
    }
}
