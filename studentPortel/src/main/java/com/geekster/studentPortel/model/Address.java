package com.geekster.studentPortel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Address {
    @Id
    private Integer id;
    private String landmark;
    private String zipcode;
    private String district;
    private String state;
    private String country;
    
}
