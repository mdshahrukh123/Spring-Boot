package com.example.jobPortal.repositories;

import com.example.jobPortal.models.JobPortal;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface JobPortalRepository extends CrudRepository<JobPortal,Integer> {

    //custom finder
    public List<JobPortal> findByStockType(String stockType);

    public List<JobPortal> findByStockPriceGreaterThanAndStockBirthTimeStampLessThanOrderByStockName(Double price, LocalDateTime date);

    //custom queries : native

    //basic select :

    @Query(value = "select * from STOCK where STOCK_MARKET_CAP > :capPercentage" , nativeQuery = true)
    public List<JobPortal> getAllStocksAboveMarketCap(Double capPercentage);

    //update using custom query

    @Modifying
    @Query(value = "update STOCK set STOCK_MARKET_CAP = :capPercentage where Stock_id = :id" , nativeQuery = true)
    public void updateMarketCapById(Double capPercentage, Integer id);

    @Modifying
    @Query(value = "Delete from Stock where Stock_owner_count <= :clientCount" , nativeQuery = true)
    public void deleteStocksBasedOnCount(Integer clientCount);






}
