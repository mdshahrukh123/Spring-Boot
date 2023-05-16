package com.geekster.studentPortel.controller;

import com.geekster.studentPortel.model.Course;
import com.geekster.studentPortel.model.Student;
import com.geekster.studentPortel.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class CourseController {
    @Autowired
    CourseService courseService;
    @PostMapping(value = "/course")
    public String AddCourse(@RequestBody List<Course> courseList){
        return courseService.addCourse(courseList);
    }

    @GetMapping(value = "/course")
    public Iterable<Course> getAllCourse(){
        return courseService.getCourse();
    }
}
