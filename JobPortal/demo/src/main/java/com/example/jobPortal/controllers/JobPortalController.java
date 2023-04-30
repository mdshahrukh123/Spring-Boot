package com.example.jobPortal.controllers;


import com.example.jobPortal.models.JobPortal;
import com.example.jobPortal.services.JobPortalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/jobPortal")
public class JobPortalController {


    @Autowired
    JobPortalService jobPortalService;

    //get stocks by type
    @GetMapping(value = "/type/{jobType}")
    public List<JobPortal> getStocksBasedOnType(@PathVariable String stockType)
    {
        return jobPortalService.getStocksByType(stockType);
    }

    //get using custom finder
    @GetMapping(value = "abovePrice/price/{price}/lowerData/date/{date}")
    public List<JobPortal> getStocksAbovePriceAndLowerDate(@PathVariable Double price, @PathVariable String date)
    {
        return jobPortalService.getStocksAbovePriceAndLowerDate(price,date);
    }

    //custom query
    @GetMapping(value = "/cap/{capPercentage}")
    public List<JobPortal> getAllStocksAboveMarketCap(@PathVariable Double capPercentage)
    {
        return jobPortalService.getAllStocksAboveMarketCap(capPercentage);
    }

    //post
    @PostMapping(value = "/")
    public String insertStocks(@RequestBody List<JobPortal> jobPortalList)
    {
        return jobPortalService.addStocks(jobPortalList);
    }

    //put
    @PutMapping(value = "/marketCap/{marketCap}/id/{id}")
    public void insertStocks(@PathVariable Double marketCap, @PathVariable Integer id)
    {
         jobPortalService.updateMarketCap(marketCap,id);
    }

    //put
    @DeleteMapping(value = "/ownerCount/{count}")
    public void removeStocksByOwnerCount(@PathVariable  Integer count)
    {
        jobPortalService.deleteStocksBasedOnCount(count);
    }


}
