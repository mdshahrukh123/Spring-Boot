package com.geekster.restaurantApp.repository;

import com.geekster.restaurantApp.model.AuthenticationToken;
import com.geekster.restaurantApp.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITokenRepo extends JpaRepository<AuthenticationToken, Long> {


    AuthenticationToken findByPatient(Staff patient);

    AuthenticationToken findFirstByToken(String token);
}
