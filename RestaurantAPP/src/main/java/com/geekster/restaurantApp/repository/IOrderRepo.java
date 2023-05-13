package com.geekster.restaurantApp.repository;

import com.geekster.restaurantApp.model.Order;
import com.geekster.restaurantApp.model.AppointmentKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepo extends JpaRepository<Order, AppointmentKey> {

    public String findByIdAppId(Long id);
}
