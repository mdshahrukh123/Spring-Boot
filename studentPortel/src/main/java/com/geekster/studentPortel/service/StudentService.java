package com.geekster.studentPortel.service;

import com.geekster.studentPortel.model.Student;
import com.geekster.studentPortel.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    IStudentRepo studentRepo;
    public String addStudent(List<Student> studentList) {
        Iterable<Student> status = studentRepo.saveAll(studentList);
        if(status != null){
            return "Added .... Successfully !!!....";
        }else{
            return "Not .. Added !!...";
        }
    }

    public Iterable<Student> getStudent() {
        return studentRepo.findAll();
    }
}
