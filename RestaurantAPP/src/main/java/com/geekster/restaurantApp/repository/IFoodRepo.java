package com.geekster.restaurantApp.repository;

import com.geekster.restaurantApp.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFoodRepo extends JpaRepository<Food, Long> {


    Food findByDoctorId(Long docId);
}
