package com.geekster.Mapping.repository;

import com.geekster.Mapping.models.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IEmployeeRepository extends CrudRepository<Employee,Long> {
}
