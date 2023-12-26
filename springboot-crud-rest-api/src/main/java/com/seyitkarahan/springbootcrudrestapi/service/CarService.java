package com.seyitkarahan.springbootcrudrestapi.service;

import com.seyitkarahan.springbootcrudrestapi.dto.CarDTO;
import com.seyitkarahan.springbootcrudrestapi.entity.Car;

import java.util.List;

public interface CarService {

    void addCar(Car car);

    List<Car> getCars();

    Car getCar(Integer id);

    void updateCar(Integer id, Car car);

    void deleteCar(Integer id);

    void updateName(Integer id, CarDTO car);
}
