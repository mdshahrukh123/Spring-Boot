package com.geekster.studentPortel.repository;

import com.geekster.studentPortel.model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepo extends CrudRepository<Course,Integer> {
}
