package com.seyitkarahan.springbootcrudrestapi.repository;

import com.seyitkarahan.springbootcrudrestapi.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {

}
