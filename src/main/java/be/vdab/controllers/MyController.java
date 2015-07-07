package be.vdab.controllers;

import be.vdab.domain.Car;
import be.vdab.repository.CarRepository;
import org.jboss.logging.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class MyController {
    @Autowired
    private CarRepository carRepository;


    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public List<Car> findAllCars() {
        return carRepository.findAll();
    }


    @RequestMapping(value = "/car/{carId}", method = RequestMethod.GET)
    public Car findCarById(@PathVariable("carId") int id) {
        return carRepository.findOne(id);
    }


//    @RequestMapping(value = "/newcar", method = RequestMethod.POST)
//    public void createCar() {
//        Car car = new Car();
//        carRepository.save(car);
//    }
//
//    @RequestMapping(value = "/delete", method = RequestMethod.PUT)
//    public void deleteCar(Car car) {
//        carRepository.delete(car.getId());
//    }
//
//
//    // TODO: update functie uitwerken
//
//    @RequestMapping(value = "/update", method = RequestMethod.PUT)
//    public void updateCar(Car car) {
//        Car c = carRepository.findOne(car.getId());
//    }

}
