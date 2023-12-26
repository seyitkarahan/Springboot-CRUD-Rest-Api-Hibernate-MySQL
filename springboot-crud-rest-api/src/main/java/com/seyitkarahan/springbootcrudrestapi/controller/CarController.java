package com.seyitkarahan.springbootcrudrestapi.controller;

import com.seyitkarahan.springbootcrudrestapi.dto.CarDTO;
import com.seyitkarahan.springbootcrudrestapi.entity.Car;
import com.seyitkarahan.springbootcrudrestapi.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping("/add")
    public String addCar(@RequestBody Car car) {
        carService.addCar(car);

        return "successfully!";
    }

    @GetMapping
    public List<Car> getCars() {
        return carService.getCars();
    }

    @GetMapping("/get")
    public Car getCar(@RequestParam Integer id) {
        return carService.getCar(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Void> updateCar(@PathVariable Integer id, @RequestBody Car car) {
        carService.updateCar(id, car);

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteCar(@PathVariable Integer id) {
        carService.deleteCar(id);

        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/update-name/{id}")
    public ResponseEntity<Void> updateName(@PathVariable Integer id, @RequestBody CarDTO carDTO) {
        carService.updateName(id, carDTO);

        return ResponseEntity.noContent().build();
    }

}
