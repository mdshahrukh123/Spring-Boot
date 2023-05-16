package com.geekster.studentPortel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Course {
    @Id
    private Integer id;
    private String title;
    private String description;
    private String duration;

    @ManyToMany
    List<Student> studentList;
}
