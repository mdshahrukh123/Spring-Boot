package com.example.jobPortal.services;

import com.example.jobPortal.models.JobPortal;
import com.example.jobPortal.repositories.JobPortalRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class JobPortalService {

    @Autowired
    JobPortalRepository stockRepo;

    //custom finder
    public List<JobPortal> getStocksByType(String stockType) {

        return stockRepo.findByStockType(stockType);
    }

    //implicit methods in crudRepo
    public String addStocks(List<JobPortal> jobPortalList) {

         Iterable<JobPortal> list = stockRepo.saveAll(jobPortalList);
         if(list!=null)
         {
             return "Added list of Stocks.....!!!";
         }
         else
         {
             return "Could not added..!!!";
         }
    }

    public List<JobPortal> getStocksAbovePriceAndLowerDate(Double price, String date) {

        LocalDateTime myDate = LocalDateTime.parse(date);
        return stockRepo.findByStockPriceGreaterThanAndStockBirthTimeStampLessThanOrderByStockName(price, myDate);
    }

    public List<JobPortal> getAllStocksAboveMarketCap(Double capPercentage) {
        return stockRepo.getAllStocksAboveMarketCap(capPercentage);
    }

    @Transactional
    public void updateMarketCap(Double marketCap, Integer id) {
        stockRepo.updateMarketCapById(marketCap,id);
    }

    @Transactional
    public void deleteStocksBasedOnCount(Integer count) {
        stockRepo.deleteStocksBasedOnCount(count);
    }
}
