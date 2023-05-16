package com.geekster.studentPortel.service;

import com.geekster.studentPortel.model.Course;
import com.geekster.studentPortel.repository.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    ICourseRepo courseRepo;
    public String addCourse(List<Course> courseList) {
        Iterable<Course> courseStatus = courseRepo.saveAll(courseList);
        if(courseStatus != null){
            return "Yes ....";
        }else{
            return "No ...";
        }
    }

    public Iterable<Course> getCourse() {
        return courseRepo.findAll();
    }
}
