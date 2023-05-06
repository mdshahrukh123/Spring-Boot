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
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String userName;
    private Integer age;


    //@JoinColumn(name = "fk_user-addressTable-addId", referencedColumnName = "addressId")
    //@OneToMany(cascade = CascadeType.ALL , mappedBy = "user")
    //@ManyToMany(cascade = CascadeType.ALL , mappedBy = "user")
    @OneToOne(mappedBy = "user")
    private List<Address> userAddress;

}
