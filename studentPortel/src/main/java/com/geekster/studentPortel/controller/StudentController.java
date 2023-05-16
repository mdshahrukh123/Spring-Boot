package com.geekster.studentPortel.controller;

import com.geekster.studentPortel.model.Student;
import com.geekster.studentPortel.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping(value = "/student")
    public String AddStudent(@RequestBody List<Student> studentList){
        return studentService.addStudent(studentList);
    }

    @GetMapping(value = "/student")
    public Iterable<Student> getAllStudent(){
        return studentService.getStudent();
    }
}
