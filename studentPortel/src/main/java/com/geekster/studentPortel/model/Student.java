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
@Entity
@Table
public class Student {
    @Id
    private Integer id;
    private String name;
    private Integer age;
    private String phoneNo;
    private String branch;
    private String department;

    @OneToOne
    private Address address;

}
