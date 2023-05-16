package com.geekster.studentPortel.repository;

import com.geekster.studentPortel.model.Laptop;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILaptopRepo extends CrudRepository<Laptop, Integer> {
}
