package com.geekster.studentPortel.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Book {
    @Id
    private Integer id;
    private String title;
    private String author;
    private String description;
    private String price;

    @ManyToMany
    private Student student;

}
