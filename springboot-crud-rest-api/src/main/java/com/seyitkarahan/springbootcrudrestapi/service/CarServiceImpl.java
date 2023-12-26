package com.seyitkarahan.springbootcrudrestapi.service;

import com.seyitkarahan.springbootcrudrestapi.dto.CarDTO;
import com.seyitkarahan.springbootcrudrestapi.entity.Car;
import com.seyitkarahan.springbootcrudrestapi.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public void addCar(Car car) {
        carRepository.save(car);
    }

    @Override
    public List<Car> getCars() {
        return carRepository.findAll();
    }

    @Override
    public Car getCar(Integer id) {
        Car car = carRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid car id: " + id));

        return car;
    }

    @Override
    public void updateCar(Integer id, Car car) {
        carRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid car id: " + id));

        car.setId(id);

        carRepository.save(car);
    }

    @Override
    public void deleteCar(Integer id) {
        Car car = carRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid car id: " + id));

        carRepository.delete(car);
    }

    @Override
    public void updateName(Integer id, CarDTO carDTO) {
        Car car = carRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid car id: " + id));

        carRepository.save(car);
    }
}
