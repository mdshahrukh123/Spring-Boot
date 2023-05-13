package com.geekster.restaurantApp.repository;

import com.geekster.restaurantApp.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStaffRepo extends JpaRepository<Staff, Long> {

    Staff findFirstByPatientEmail(String userEmail);
}
