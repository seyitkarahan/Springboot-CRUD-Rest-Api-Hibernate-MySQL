package com.seyitkarahan.springbootcrudrestapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    @Id
    @GeneratedValue
    private Integer id;

    private String carName;

    private Integer carModel;

}
