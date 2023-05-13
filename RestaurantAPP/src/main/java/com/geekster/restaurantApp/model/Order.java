package com.geekster.restaurantApp.model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, scope = Order.class,property = "id")
public class Order {

    @Id
    @EmbeddedId
    private AppointmentKey id;

    @ManyToOne
    @JoinColumn(name = "fk_doctor_doc_id")
    private Food doctor;

    @OneToOne
    private Staff patient;

}
