package com.geekster.Mapping.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Address {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;
    private String street;
    private String city;
    private String state;
    private String zipCode;


    //@ManyToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name = "")
    //@ManyToOne(cascade = CascadeType.ALL)
//    @OneToOne(cascade = CascadeType.ALL)
    private List<Employee> user;

}
