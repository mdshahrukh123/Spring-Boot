package com.geekster.studentPortel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Laptop {
    @Id
    private Integer id;
    private String name;
    private String brand;
    private String price;

    @OneToOne
    private Student student;
}
