package be.vdab.controllers;

import be.vdab.domain.Brand;
import be.vdab.domain.Car;
import be.vdab.repository.BrandRepository;
import be.vdab.repository.CarRepository;
import be.vdab.repository.ModelRepository;
import org.jboss.logging.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class MyController {
    @Autowired
    private CarRepository carRepository;
    private ModelRepository modelRepository;
    private BrandRepository brandRepository;


    @RequestMapping(value = "/car/all", method = RequestMethod.GET)
    public String findAllCars() {
        return carRepository.findAll().toString();
    }


    @RequestMapping(value = "/car/{carId}", method = RequestMethod.GET)
    public Car findCarById(@PathVariable("carId") int id) {
        return carRepository.findOne(id);
    }

    @RequestMapping(value = "/car/{carId}", method = RequestMethod.DELETE)
    public void deleteCar(@PathVariable("carId") int id) {
        carRepository.delete(id);
    }
//    TODO: update functie uitwerken
//
//    @RequestMapping(value = "/update", method = RequestMethod.PUT)
//    public void updateCar(Car car) {
//        Car c = carRepository.findOne(car.getId());
//
//    @RequestMapping(value = "/newcar", method = RequestMethod.POST, consumes = "application/json")
//    public void createCar(@RequestBody Car car) {
//        carRepository.save(car);
//    }
// ------------------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------------------

    @RequestMapping(value = "/brand/all", method = RequestMethod.GET)
    public List<Brand> findAllBrands() {
        return brandRepository.findAll();
    }

    //@RequestMapping (value = "model/all")




}

